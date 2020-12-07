package logicController;

import logicController.Models.RoundHandler;

public class Board {
    private RoundHandler rh = new RoundHandler();

    public void newBoard(int size, int roundNrs) {

        rh.newGame(size, roundNrs);

    }
}
