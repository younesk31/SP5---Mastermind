package visualController;

import logicController.Models.Pin;
import logicController.RoundHandler;
import processing.core.PApplet;
import visualController.processing.GameObject;

public class MasterCode implements GameObject {

    private final RoundHandler rh;

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
            // System.out.println(rh.getArrMasterCode().get(pin.getColorId()));
        }
    }


    @Override
    public void draw(PApplet p) {

        if (rh.getCurrentRound() == 9 || rh.endGame() == true) {
            System.out.println("You have won from draw in mastercode");
            drawMasterMindCode(p);
        }

    }

    public void newGame() {

    }

    public void colorChanger(int pinPos, int color) {

    }

    @Override
    public String getName() {
        return null;
    }

    @Override
    public void update(int curtimeMillis, PApplet p) {
    }
}
