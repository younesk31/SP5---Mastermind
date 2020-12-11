package logicController.Models;

import java.util.ArrayList;

public class Round {
    ColorController cc = new ColorController();

    private ArrayList<Pin> playerInputArray = new ArrayList<>();
    private ArrayList<Pin> feedbackArray = new ArrayList<>();

    public Round(int size) {
        this.playerInputArray = newPlayerRound(size);
        this.feedbackArray = newFeedbackRound(size);
    }

    public ArrayList<Pin> newPlayerRound(int size) {

        for (int i = 0; i < size; i++) {
            Pin pin = new Pin();
            //Set colur to grey
            int color = 0;
            cc.intToColor(color, pin);
            playerInputArray.add(pin);
        }
        return playerInputArray;
    }

    public ArrayList<Pin> newFeedbackRound(int size) {

        for (int i = 0; i < size; i++) {
            Pin pin = new Pin();
            //Set colur to grey
            int color = 0;
            cc.intToColor(color, pin);
            feedbackArray.add(pin);
        }
        return feedbackArray;
    }

    public ArrayList<Pin> getPlayerInputArray() {
        return playerInputArray;
    }

    public ArrayList<Pin> getFeedbackArray() {
        return feedbackArray;
    }
}
