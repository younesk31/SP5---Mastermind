package logicController.Models;

import logicController.RoundHandler;

import java.util.ArrayList;
import java.util.Random;

public class MasterMindCode {
    ColorController cc = new ColorController();
    ArrayList<Pin> arrMasterCode = new ArrayList<Pin>();



    public ArrayList<Pin> MasterMindCode(){
        return arrMasterCode;
    }

    public void newMasterMindCode(int size, boolean choice) {
        if (!choice) {
            this.arrMasterCode = randomScramble(size);
        } else
            this.arrMasterCode = playerChoice(size);
    }

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

    public ArrayList<Pin> playerChoice(int size) {


        return null;
    }

    public ArrayList<Pin> getArrMasterCode() {
        return arrMasterCode;
    }

    public void setArrMasterCode(ArrayList<Pin> arrMasterCode) {
        this.arrMasterCode = arrMasterCode;
    }


}
