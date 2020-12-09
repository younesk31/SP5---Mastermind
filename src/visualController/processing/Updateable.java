package visualController.processing;

import processing.core.PApplet;

public interface Updateable
{
    public void update(int curtimeMillis, PApplet p);
}
