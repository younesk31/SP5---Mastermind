package visualController;

import logicController.FeedbackPinLogic;
import logicController.Models.ColorController;
import logicController.Models.Pin;
import logicController.Models.Round;
import logicController.RoundHandler;
import processing.core.PApplet;
import visualController.processing.GameObject;

public class FeedbackField implements GameObject {
    private final RoundHandler rh;
    Pin pin = new Pin();
    ColorController cc = new ColorController();
    FeedbackPinLogic fpl = new FeedbackPinLogic();

    public FeedbackField(RoundHandler rh) {
        this.rh = rh;
    }


    public void createFeedbackCircles(PApplet p) {
        int x;
        int y = p.height - 30;
        for (Round r : rh.getRounds()) {
            y -= 45;
            x = (p.width / 2) + 115;
            for (Pin pin : r.getFeedbackArray()) {
                p.fill(pin.getR(), pin.getG(), pin.getB());
                p.circle(x, y, 15);

                pin.setPinx(x);
                pin.setPiny(y);
                x += 20;
            }
        }
    }


    @Override
    public void draw(PApplet p) {
        createFeedbackCircles(p);
    }

    @Override
    public String getName() {
        return null;
    }

    @Override
    public void update(int curtimeMillis, PApplet p) {

    }
}