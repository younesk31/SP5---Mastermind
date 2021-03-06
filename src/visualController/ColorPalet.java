package visualController;

import logicController.Models.ColorController;
import logicController.Models.Pin;
import logicController.Models.Round;
import logicController.RoundHandler;
import processing.core.PApplet;
import visualController.processing.GameObject;

public class ColorPalet extends PApplet implements GameObject {
    private final RoundHandler rh;
    private final int x = 25;
    private final int y = 25;
    private final int w = 45;
    private final int h = 45;
    Pin mousePin = new Pin();
    ColorController cc = new ColorController();

    public ColorPalet(RoundHandler rh) {
        this.rh = rh;
    }

    public void checkPinpos(PApplet p) {
        for (Round r : rh.getRounds()) {
            for (int i = 0; i < r.getPlayerInputArray().size(); i++) {
                if (p.mouseX < r.getPlayerInputArray().get(i).getPinx() + 15 && p.mouseX > r.getPlayerInputArray().get(i).getPinx() - 15 && p.mouseY > r.getPlayerInputArray().get(i).getPiny() - 15 && p.mouseY < r.getPlayerInputArray().get(i).getPiny() + 15 && p.mouseButton == p.LEFT && p.mousePressed) {
                    cc.intToColor(mousePin.getColorId(), r.getPlayerInputArray().get(i));
                }
            }
        }
    }

    public void button(PApplet p) {
        p.fill(255, 0, 0);
        p.ellipse(x, y + 50, w, h);
        p.fill(0, 255, 0);
        p.ellipse(x, y + 100, w, h);
        p.fill(0, 0, 255);
        p.ellipse(x, y + 150, w, h);
        p.fill(255);
        p.ellipse(x, y + 200, w, h);
        p.fill(0);
        p.ellipse(x, y + 250, w, h);
        p.fill(255, 255, 0);
        p.ellipse(x, y + 300, w, h);
        p.fill(139, 69, 19);
        p.ellipse(x, y + 350, h, w);
        p.fill(128, 0, 128);
        p.ellipse(x, y + 400, h, w);
        p.fill(0);
        p.rect(x - 15, y + 690, x + 40, y);
        p.fill(255);
        p.textSize(12);
        p.text("submit", x, y + 705);
        p.fill(0);
        p.rect(x - 15, y + 725, x + 40, y);
        p.fill(255);
        p.text("clear", x, y + 740);
        p.textSize(15);
        String r = "Round: ";
        p.text(r + (rh.getCurrentRound()), p.width - p.textWidth(r + (10)), p.height >> 6);
    }

    public void buttonPressed(PApplet p) {

        if (PApplet.dist(p.mouseX, p.mouseY, x, y + 50) <= w / 2 && p.mouseButton == p.LEFT && p.mousePressed) {
            mousePin.setColorId(1);
        } else if (PApplet.dist(p.mouseX, p.mouseY, x, y + 100) <= w / 2 && p.mouseButton == p.LEFT && p.mousePressed) {
            mousePin.setColorId(2);
        } else if (PApplet.dist(p.mouseX, p.mouseY, x, y + 150) <= w / 2 && p.mouseButton == p.LEFT && p.mousePressed) {
            mousePin.setColorId(3);
        } else if (PApplet.dist(p.mouseX, p.mouseY, x, y + 200) <= w / 2 && p.mouseButton == p.LEFT && p.mousePressed) {
            mousePin.setColorId(4);
        } else if (PApplet.dist(p.mouseX, p.mouseY, x, y + 250) <= w / 2 && p.mouseButton == p.LEFT && p.mousePressed) {
            mousePin.setColorId(5);
        } else if (PApplet.dist(p.mouseX, p.mouseY, x, y + 300) <= w / 2 && p.mouseButton == p.LEFT && p.mousePressed) {
            mousePin.setColorId(6);
        } else if (PApplet.dist(p.mouseX, p.mouseY, x, y + 350) <= w / 2 && p.mouseButton == p.LEFT && p.mousePressed) {
            mousePin.setColorId(7);
        } else if (PApplet.dist(p.mouseX, p.mouseY, x, y + 400) <= w / 2 && p.mouseButton == p.LEFT && p.mousePressed) {
            mousePin.setColorId(8);
        } else if (p.mouseX >= x - 15 && p.mouseX <= (x + w + 5) && p.mouseY >= (y + 690) && p.mouseY <= ((y + 690) + (y)) && p.mousePressed && p.mouseButton == p.LEFT) {
            roundSubmitter(p);
        } else if (p.mouseX >= x - 15 && p.mouseX <= (x + w + 5) && p.mouseY >= (y + 725) && p.mouseY <= ((y + 725) + (y)) && p.mouseButton == p.LEFT && p.mousePressed) {
            mousePin.setColorId(0);
        }
    }


    public void colorFeedbackPins() {
        System.out.println("code: " + rh.getArrMasterCode().get(0).getColorId() + rh.getArrMasterCode().get(1).getColorId() + rh.getArrMasterCode().get(2).getColorId() + rh.getArrMasterCode().get(3).getColorId());
        int countRed = 0;

        for (int i = 0; i <= 3; i++) {
            cc.intToColor(rh.getRounds().get(rh.getCurrentRound()).getFeedbackArray().get(i).getColorId(), rh.getRounds().get(rh.getCurrentRound()).getFeedbackArray().get(i));
            System.out.println("FeedBackpin:" + i + " --> " + rh.getRounds().get(rh.getCurrentRound()).getFeedbackArray().get(i).getColorId());
            if (rh.getRounds().get(rh.getCurrentRound()).getFeedbackArray().get(i).getColorId() == 1) {
                countRed++;
            }
        }


        if (countRed == 4) {
            System.out.println("you win");
            rh.endGame(1);
        }
    }


    void roundSubmitter(PApplet p) {
        int count = 0;
        for (Pin playerpin : rh.getRounds().get(rh.getCurrentRound()).getPlayerInputArray()) {
            if (playerpin.getColorId() == 0) {
                String error = "Du mangler at vælge en farve";
                p.text(error, (p.width - (p.textWidth(error) / 2) * 3), p.height >> 3);
                //System.out.println("Du mangler at vælge en farve");
            } else {
                count++;
                //System.out.println(playerpin.getColorId());
            }
        }
        if (count == 4) {
            rh.endRound();
            System.out.println("Round: " + rh.getCurrentRound());
            colorFeedbackPins();
            rh.incrementRound();

        }
    }

    @Override
    public void draw(PApplet p) {
        button(p);
        buttonPressed(p);

    }

    @Override
    public String getName() {
        return null;
    }

    @Override
    public void update(int curtimeMillis, PApplet p) {
        checkPinpos(p);

    }


}
