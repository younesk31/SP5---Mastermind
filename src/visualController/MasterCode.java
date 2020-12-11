package visualController;

import logicController.Models.Pin;
import logicController.RoundHandler;
import processing.core.PApplet;
import visualController.processing.GameObject;

public class MasterCode implements GameObject {

    private final RoundHandler rh;
    private final int x = 250;
    private final int y = 400;

    public MasterCode(RoundHandler rh) {
        this.rh = rh;
    }

    public void drawMasterMindCode(PApplet p) {
        int x = p.width / 2;
        int y = 150;
        for (Pin pin : rh.getArrMasterCode()) {
            p.fill(pin.getR(), pin.getG(), pin.getB());
            p.circle(x, y, 20);
            x += 35;
        }
    }


    @Override
    public void draw(PApplet p) {
        //Condition for when you win
        if (rh.getCurrentRound() == 9 || rh.endGame()) {
            //draw the MasterMindCode
            drawMasterMindCode(p);

            //Win text
            p.fill(0);
            p.textSize(25);
            p.text("YOU ARE AWESOME YOU WON!!!", 55, p.height / 2 - 175);

            //New game bottom
            p.fill(0);
            p.rect(x - 100, y - 150, 75, 25);
            p.fill(255);
            p.textSize(12);
            p.text("New game?", x - 95, y - 133);

            //Quit game Bottom
            p.fill(0);
            p.rect(x + 15, y - 150, 75, 25);
            p.fill(255);
            p.text("Quit game?", x + 20, y - 133);

            //Making the bottoms clickable
            if (p.mouseX >= x - 100 && p.mouseX <= x - 25 && p.mouseY >= y - 150 && p.mouseY <= y - 125 && p.mousePressed && p.mouseButton == p.LEFT) {
                rh.newGame(4, 10);
                rh.setState(false);
                rh.setCurrentRound(0);
            } else if (p.mouseX >= x + 15 && p.mouseX <= x + 90 && p.mouseY >= y - 150 && p.mouseY <= y - 125 && p.mouseButton == p.LEFT && p.mousePressed) {
                p.exit();
            }
        }
    }


    @Override
    public String getName() {
        return null;
    }

    @Override
    public void update(int curtimeMillis, PApplet p) {
    }
}
