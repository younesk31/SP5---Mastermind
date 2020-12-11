package visualController.processing;


import logicController.RoundHandler;
import processing.core.PApplet;
import visualController.*;

import java.util.ArrayList;
import java.util.List;

public class Mastermind implements ProcessingApp {
    private final List<GameObject> gameObjects;
    private final RoundHandler rh;

    public Mastermind() {
        this.rh = new RoundHandler();
        rh.newGame(4, 10);
        gameObjects = new ArrayList<>();
        addGameObject(new Board());
        addGameObject(new PlayerInputField(this.rh));
        addGameObject(new ColorPalet(this.rh));
        addGameObject(new FeedbackField(this.rh));
        addGameObject(new MasterCode(this.rh));

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
        p.frameRate(10);
        for (GameObject g : gameObjects) {
            g.draw(p);
        }
    }
}