import gameController.PinController;
import logicController.CheckPlayerPin;
import logicController.Models.MasterMindCode;
import logicController.RoundHandler;
import processing.core.PApplet;
import visualController.processing.MyApp;


public class Main extends PApplet {

    private static MyApp app;

    public static void main(String[] args) {


        app = new MyApp();
        String[] appletArgs = new String[] { "Main" };
        PApplet.main(appletArgs);

    }

    public void settings()
    {
        app.settings(this);
    }


    public void draw()
    {
        int curtimeMillis = millis();
        app.update(curtimeMillis, this);
        app.draw(this);
    }
}
