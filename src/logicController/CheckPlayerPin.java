package logicController;

import logicController.Models.MasterMindCode;
import logicController.Models.Pin;
import logicController.Models.Round;

import java.util.ArrayList;


public class CheckPlayerPin {

    int correctColor;
    int correctPos;

    FeedbackPinLogic fb = new FeedbackPinLogic();


    public boolean checkPlayerPinPos(ArrayList<Pin> playerPins, int pos, MasterMindCode mmc) {

        return playerPins.get(pos).getColorId() == (mmc.getArrMasterCode().get(pos).getColorId());
    }

    public void checkPlayerPinColor(Round round, MasterMindCode mmc) {
        for (int i = 0; i < round.getPlayerInputArray().size(); i++) {
            for (int j = 0; j < mmc.getArrMasterCode().size(); j++) {
                if (round.getPlayerInputArray().get(i).getColorId() == mmc.getArrMasterCode().get(j).getColorId() && mmc.getArrMasterCode().get(j).getChecked() == false) {
                    if (checkPlayerPinPos(round.getPlayerInputArray(), i, mmc)) {
                        correctPos++;
                        mmc.getArrMasterCode().get(j).setChecked(true);
                    } else {
                        correctColor++;
                        mmc.getArrMasterCode().get(j).setChecked(true);
                    }
                }
            }
        }
        fb.pinHandler(round, correctPos, correctColor);
    }

    public int getCorrectColor() {
        return correctColor;
    }

    public int getCorrectPos() {
        return correctPos;
    }
}
