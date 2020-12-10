package logicController;

import logicController.Models.Pin;
import logicController.Models.Round;

import java.util.ArrayList;


public class CheckPlayerPin {

    int correctColor;
    int correctPos;

    FeedbackPinLogic fb = new FeedbackPinLogic();


    public boolean checkPlayerPinPos(ArrayList<Pin> playerPins, int pos, ArrayList<Pin> mmc) {

        return playerPins.get(pos).getColorId() == (mmc.get(pos).getColorId());
    }

    public void checkPlayerPinColor(Round round, ArrayList<Pin> mmc) {
        for (int i = 0; i < round.getPlayerInputArray().size(); i++) {
            for (int j = 0; j < mmc.size(); j++) {
                if (round.getPlayerInputArray().get(i).getColorId() == mmc.get(j).getColorId() && round.getPlayerInputArray().get(i) == mmc.get(j)) {
                    correctPos++;
                    mmc.get(j).setChecked(true);
                    i++;
                } else if(round.getPlayerInputArray().get(i).getColorId()== mmc.get(j).getColorId() && round.getPlayerInputArray().get(i) != mmc.get(j)){
                    correctColor++;
                    mmc.get(j).setChecked(true);
                }

//                if (checkPlayerPinPos(round.getPlayerInputArray(), i, mmc)) {
//
//
//
//
//                        mmc.get(j).setChecked(true);
//                        i++;
//                    } else {
//                        correctColor++;
//                        mmc.get(j).setChecked(true);
//                    }

            }
        }
        fb.pinHandler(round, correctPos, correctColor);


        correctColor = 0;
        correctPos = 0;
        for(Pin p : mmc ){
            p.setChecked(false);
        }


    }


public void checkPlayerPinColorNewTry(Round round, ArrayList<Pin> mmc){
        for(Pin mmcPin : mmc){
            for(Pin playPin : round.getPlayerInputArray()){

                //if(p.getColorId()

            }

        }
        }


    public int getCorrectColor() {
        return correctColor;
    }

    public int getCorrectPos() {
        return correctPos;
    }
}
