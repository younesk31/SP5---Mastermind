package visualController.processing;

import processing.core.PApplet;

public interface Updateable {
    void update(int curtimeMillis, PApplet p);
}
