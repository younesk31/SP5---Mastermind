package logicController;


import logicController.Models.MasterMindCode;
import logicController.Models.Round;

import java.util.ArrayList;


public class RoundHandler extends MasterMindCode {
    private final ArrayList<Round> rounds = new ArrayList<>();
    CheckPlayerPin cpp = new CheckPlayerPin();
    int currentRound = 0;
    boolean state = false;

    public void newGame(int size, int roundNrs, boolean choice) {

        rounds.clear();
        resetMastercode();
        if (!choice) {
            randomScramble(size);
        }

        for (int i = 0; i < roundNrs; i++) {
            rounds.add(new Round(size));
        }
    }

    public void endRound() {
        getArrMasterCode();
        cpp.checkPlayerPinColor(rounds.get(currentRound), getArrMasterCode());

        if (currentRound == 9) {
            System.out.println("End Of game");
            //newGame(4, 10);
            //System.out.println(currentRound);
            setCurrentRound(0);
            System.out.println("Started New Game");
        }

    }

    public boolean endGame() {
        return state;
    }

    public void setState(boolean state) {
        this.state = state;
    }

    public boolean endGame(int win) {
        if (win == 1) {
            state = true;
        }
        if (win == 2) {
            state = false;
        }
        return state;
    }

    public void incrementRound() {
        currentRound++;
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
