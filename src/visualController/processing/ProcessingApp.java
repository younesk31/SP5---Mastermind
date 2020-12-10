package visualController.processing;

import processing.core.PApplet;

public interface ProcessingApp {
    void settings(PApplet p);

    void update(int curtimeMillis, PApplet p);

    void draw(PApplet p);
}
