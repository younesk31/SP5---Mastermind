package logicController.Models;

import logicController.RoundHandler;

import java.util.ArrayList;
import java.util.Random;

public class MasterMindCode {
    ColorController cc = new ColorController();
    ArrayList<Pin> arrMasterCode = new ArrayList<Pin>();



    public ArrayList<Pin> MasterMindCode() {
        return arrMasterCode;
    }

    // create the a new mastermind code everytime a choice is given either by the player or by the "pc" (initialized)
    public void newMasterMindCode(int size, boolean choice) {
        if (!choice) {
            this.arrMasterCode = randomScramble(size);
        } else {
            //this.arrMasterCode = playerChoice(size);
        }
    }

    // randomize the mastercode so that its random
    public ArrayList<Pin> randomScramble(int size) {
        for (int i = 0; i < size; i++) {
            Pin pin = new Pin();
            Random rnd = new Random();
            int color = rnd.nextInt(8) + 1;
            cc.intToColor(color, pin);
            arrMasterCode.add(pin);
        }
        return arrMasterCode;
    }

    public ArrayList<Pin> playerChoice(int size, Round round) {

        for (Pin p : round.getPlayerInputArray()){
            Pin pin = new Pin();
            cc.intToColor(p.getColorId(),pin);
            arrMasterCode.add(pin);
            cc.intToColor(0,p);
        }

        return arrMasterCode;

    }

    public void resetMastercode() {
        arrMasterCode.clear();
    }

    public ArrayList<Pin> getArrMasterCode() {
        return arrMasterCode;


    }
}
