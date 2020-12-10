package logicController;

import logicController.Models.ColorController;
import logicController.Models.Round;


public class FeedbackPinLogic {

    ColorController cc = new ColorController();

    public void pinHandler(Round round, int correctPos, int correctColor){
        int iPos = 0;
        int iColor = 0;
        int indexPos = 0;

        while (iPos < round.getFeedbackArray().size()) {
            //CorrectColor
            for (int i = iColor; iColor < correctColor; iColor++) {
                round.getFeedbackArray().get(iPos).setColorId(4); // hvid
                iPos++;
            }

            //CorrectPos
            for (int i = indexPos; indexPos < correctPos; indexPos++) {
                round.getFeedbackArray().get(iPos).setColorId(1); // rød
                iPos++;
            }
            //Uncorrect
            if (iPos < round.getFeedbackArray().size()) {
                round.getFeedbackArray().get(iPos).setColorId(0);
            }
            iPos++;
        }
    }

    public void winCondition(){

    }

    public void loseCondition(){

    }

}
