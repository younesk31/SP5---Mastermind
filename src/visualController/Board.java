package visualController;

import processing.core.PApplet;
import visualController.processing.GameObject;

public class Board implements GameObject {
    @Override
    public void draw(PApplet p) {
        p.background(64);
        p.fill(139, 69, 19);
        p.rect(p.width / 6, 20, 400, 760);
    }

    @Override
    public String getName() {
        return null;
    }

    @Override
    public void update(int curtimeMillis, PApplet p) {

    }
}
