package visualController;

import logicController.Rules;
import visualController.processing.Mastermind;

// reserved for possible pc player
public class Menu {
    Mastermind m = new Mastermind();

    public void showStartMenu() {

    }

    public void showRules() {
        new Rules();
    }

}