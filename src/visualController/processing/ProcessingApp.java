package visualController.processing;

import processing.core.PApplet;

public interface ProcessingApp {
    public void settings(PApplet p);
    public void update(int curtimeMillis, PApplet p);
    public void draw(PApplet p);
}
