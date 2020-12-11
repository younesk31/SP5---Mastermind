package logicController;

import logicController.Models.Pin;
import logicController.Models.Round;

import java.util.ArrayList;


public class CheckPlayerPin {

    int correctColor;
    int correctPos;

    FeedbackPinLogic fb = new FeedbackPinLogic();


    public void checkPlayerPinColor(Round round, ArrayList<Pin> mmc) {
        for (int j = 0; j < mmc.size(); j++) {
            if (round.getPlayerInputArray().get(j).getColorId() == mmc.get(j).getColorId() && round.getPlayerInputArray().get(j).getChecked() == false) {
                correctPos++;
                round.getPlayerInputArray().get(j).setChecked(true);
                mmc.get(j).setChecked(true);
            } else {
                for (int i = 0; i < round.getPlayerInputArray().size(); ++i) {

                    if (round.getPlayerInputArray().get(i).getColorId() == mmc.get(j).getColorId() && mmc.get(j).getChecked() == false) {
                        correctColor++;
                        round.getPlayerInputArray().get(i).setChecked(true);
                        mmc.get(j).setChecked(true);
                    }
                }
            }
        }
        fb.pinHandler(round, correctPos, correctColor);
        correctColor = 0;
        correctPos = 0;
        for (Pin p : mmc) {
            p.setChecked(false);
        }
        for (Pin p : round.getPlayerInputArray()) {
            p.setChecked(false);
        }
    }
}
