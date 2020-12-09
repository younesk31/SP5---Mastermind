package logicController;

import logicController.Models.Round;

import java.util.ArrayList;

public class RoundHandler {
    private ArrayList<Round> rounds = new ArrayList<>();


    public void newGame(int size, int roundNrs) {

        rounds.clear();

        for(int i = 0; i < roundNrs; i++) {
            rounds.add(new Round(size));
        }
    }
/*
    public void nextRound(int size) {
        rounds.add(new Round(size));
        roundCount++;

    }

 */

    public ArrayList<Round> getRounds() {
        return rounds;
    }
}
