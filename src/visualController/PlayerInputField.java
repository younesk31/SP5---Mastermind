package visualController;
import logicController.Models.Pin;
import logicController.Models.Round;
import processing.core.PApplet;
import visualController.processing.GameObject;
import logicController.RoundHandler;

public class PlayerInputField implements GameObject {

    private final RoundHandler rh;

    public PlayerInputField(RoundHandler rh) {
        this.rh = rh;
    }


    @Override
    public void draw(PApplet p){
        int x;
        int y = p.height-30;
        for(Round r: rh.getRounds()) {
            y -= 45;
            x = p.width/2-35;
            for(Pin pin: r.getPlayerInputArray()){
                p.fill(pin.getR(),pin.getG() ,pin.getB());
                p.circle(x,y,30);
                x += 35;

                //Søren laver det her senere: ok
                //pin.setX = x;
                //pin.setY = y;
                //pin.setSize = 30;


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
