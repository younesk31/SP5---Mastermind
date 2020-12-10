package visualController.processing;

import gameController.PinController;
import logicController.RoundHandler;
import processing.core.PApplet;
import visualController.Board;
import visualController.ColorPalet;
import visualController.FeedbackField;
import visualController.PlayerInputField;

import java.util.ArrayList;
import java.util.List;

public class Mastermind implements ProcessingApp {
    private final List<GameObject> gameObjects;
    private final RoundHandler rh;
    PinController pc = new PinController();


    public Mastermind() {
        this.rh = new RoundHandler();
        rh.newGame(4, 10);


        //Test
//        pc.changePlayerPin(rh.getRounds().get(0), 0, 1);


        //Test
//        MasterMindCode mm = new MasterMindCode(4, false);
//        mm.getArrMasterCode().get(0).setColorId(1);
//        mm.getArrMasterCode().get(1).setColorId(3);
//        mm.getArrMasterCode().get(2).setColorId(5);
//        mm.getArrMasterCode().get(3).setColorId(6);
        gameObjects = new ArrayList<>();
        addGameObject(new Board());
        addGameObject(new PlayerInputField(this.rh));
        addGameObject(new ColorPalet(rh));
        addGameObject(new FeedbackField(this.rh));
    }

    public void addGameObject(GameObject d) {
        gameObjects.add(d);
    }

    @Override
    public void settings(PApplet p) {
        p.size(500, 800);
    }

    @Override
    public void update(int curtimeMillis, PApplet p) {
        for (GameObject g : gameObjects) {
            g.update(curtimeMillis, p);
        }
    }

    @Override
    public void draw(PApplet p) {
        p.background(64);
        for (GameObject g : gameObjects) {
            g.draw(p);
        }
    }
}