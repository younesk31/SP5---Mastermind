package gameController;

import logicController.Models.ColorController;
import logicController.Models.Round;

public class PinController {

    ColorController cc = new ColorController();


    public void changePlayerPin(Round round, int pos, int color) {
        cc.intToColor(color, round.getPlayerInputArray().get(pos));


    }


    public void changeFeedbackPin(Round round, int pos, int color) {
        cc.intToColor(color, round.getFeedbackArray().get(pos));

    }


}
