package logicController;


import logicController.Models.MasterMindCode;
import logicController.Models.Round;

import java.util.ArrayList;


public class RoundHandler {
    private final ArrayList<Round> rounds = new ArrayList<>();
    CheckPlayerPin cpp = new CheckPlayerPin();
    MasterMindCode mmc;
    int currentRound = 0;

    public void newGame(int size, int roundNrs) {
        mmc = new MasterMindCode(size, false);

        rounds.clear();
        for (int i = 0; i < roundNrs; i++) {
            rounds.add(new Round(size));
        }
    }

    public void nextRound() {
        cpp.checkPlayerPinColor(rounds.get(currentRound), mmc);

        if (currentRound == 9) {
            System.out.println("End Game");
            newGame(4, 10);
            //System.out.println(currentRound);
            setCurrentRound(0);
            System.out.println("Started New Game");
        } else {
            currentRound++;
        }
    }

    public int getCurrentRound() {
        return currentRound;
    }

    public void setCurrentRound(int currentRound) {
        this.currentRound = currentRound;
    }

    public ArrayList<Round> getRounds() {
        return rounds;
    }
}
