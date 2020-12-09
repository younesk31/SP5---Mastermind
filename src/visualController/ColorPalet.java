package visualController;

import logicController.Models.Pin;
import processing.core.PApplet;
import visualController.processing.GameObject;

public class ColorPalet implements GameObject {

    private final int x = 25;
    private final int y = 25;
    private final int w = 45;
    private final int h = 45;

    void button(PApplet p) {
        p.fill(128,128,128);
        p.ellipse(x, y, w, h);
        p.fill(255,0,0);
        p.ellipse(x, y + 50,w,h);
        p.fill(0,255,0);
        p.ellipse(x,y + 100, w, h);
        p.fill(0,0,255);
        p.ellipse(x,y + 150, w, h);
        p.fill(255);
        p.ellipse(x,y + 200, w, h);
        p.fill(0);
        p.ellipse(x,y+250,w,h);
        p.fill(255,255,0);
        p.ellipse(x, y +300,w,h);
        p.fill(139,69,19);
        p.ellipse(x,y+350 ,h ,w);
        p.fill(128,0,128);
        p.ellipse(x,y+400,h,w);
    }

    void buttonPressed (PApplet p) {
        Pin pin = new Pin();

        if (PApplet.dist(p.mouseX,p.mouseY,x,y) <= w/2 && p.mouseButton == p.LEFT && p.mousePressed) {
            System.out.println("pressed grey");
            //pin.setColorId(0);

        } else if (PApplet.dist(p.mouseX,p.mouseY,x,y+50) <= w/2 && p.mouseButton == p.LEFT && p.mousePressed) {
            System.out.println("pressed red");

        } else if (PApplet.dist(p.mouseX,p.mouseY,x,y+100) <= w/2 && p.mouseButton == p.LEFT && p.mousePressed) {
            System.out.println("pressed green");

        } else if (PApplet.dist(p.mouseX,p.mouseY,x,y+150) <= w/2 && p.mouseButton == p.LEFT && p.mousePressed) {
            System.out.println("pressed blue");

        } else if (PApplet.dist(p.mouseX,p.mouseY,x,y+200) <= w/2 && p.mouseButton == p.LEFT && p.mousePressed) {
            System.out.println("pressed white");

        } else if (PApplet.dist(p.mouseX,p.mouseY,x,y+250) <= w/2 && p.mouseButton == p.LEFT && p.mousePressed) {
            System.out.println("pressed black");

        } else if (PApplet.dist(p.mouseX,p.mouseY,x,y+300) <= w/2 && p.mouseButton == p.LEFT && p.mousePressed) {
            System.out.println("pressed yellow");

        } else if (PApplet.dist(p.mouseX,p.mouseY,x,y+350) <= w/2 && p.mouseButton == p.LEFT && p.mousePressed) {
            System.out.println("pressed brown");

        } else if (PApplet.dist(p.mouseX,p.mouseY,x,y+400) <= w/2 && p.mouseButton == p.LEFT && p.mousePressed) {
            System.out.println("pressed purple");

        }
    }

    public void mover(PApplet a) {
        a.ellipse(a.mouseX,a.mouseY,10,10);
    }

    @Override
    public void draw(PApplet p) {
        button(p);

    }

    @Override
    public String getName() {
        return null;
    }

    @Override
    public void update(int curtimeMillis, PApplet p) {
        buttonPressed(p);
        mover(p);
    }
}
