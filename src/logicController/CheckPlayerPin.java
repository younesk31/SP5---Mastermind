package logicController;

import logicController.Models.*;

import java.util.ArrayList;


public class CheckPlayerPin {

    int correctColor;
    int correctPos;

    RoundHandler rh = new RoundHandler();
    FeedbackPinLogic fb = new FeedbackPinLogic();


    public boolean checkPlayerPinPos(ArrayList<Pin> playerPins, MasterMindCode mmc, int pos) {

        if(playerPins.get(pos).getColorId() == (mmc.getArrMasterCode().get(pos).getColorId())){
            return true;
        } else { return false;}
    }

    public void checkPlayerPinColor(Round round, MasterMindCode mmc) {
        for (int i = 0; i < round.getPlayerInputArray().size(); i++) {
            for (int j = 0; j < mmc.getArrMasterCode().size(); j++) {
                if(round.getPlayerInputArray().get(i).getColorId() == mmc.getArrMasterCode().get(j).getColorId()){
                    if (checkPlayerPinPos(round.getPlayerInputArray(),mmc, i)) {
                        correctPos++;
                    } else {
                        correctColor++;
                    }
                }
            }
        }
        fb.pinHandler(round,correctPos,correctColor);
    }

    public int getCorrectColor() {
        return correctColor;
    }

    public int getCorrectPos() {
        return correctPos;
    }
}
