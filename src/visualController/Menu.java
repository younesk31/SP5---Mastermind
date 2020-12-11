package visualController;

import logicController.Rules;
import visualController.processing.Mastermind;


public class Menu {
    Mastermind m = new Mastermind();

    public void showStartMenu() {

    }

    public void showRules() {
        new Rules();
    }

}