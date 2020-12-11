import processing.core.PApplet;
import visualController.processing.Mastermind;


public class Main extends PApplet {

    private static Mastermind app;

    public static void main(String[] args) {
        app = new Mastermind();
        String[] appletArgs = new String[]{"Main"};
        PApplet.main(appletArgs);
    }

    public void settings() {
        app.settings(this);
    }


    public void draw() {
        int curtimeMillis = millis();
        app.update(curtimeMillis, this);
        app.draw(this);
    }
}
