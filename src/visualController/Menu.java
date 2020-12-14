package visualController;

import logicController.RoundHandler;
import logicController.Rules;
import processing.core.PApplet;
import visualController.processing.GameObject;

// reserved for possible pc player
public class Menu implements GameObject {

    private final RoundHandler rh;
    boolean drawMenu = true;
    boolean startGame1 = false;


    public Menu(RoundHandler rh) {
        this.rh = rh;
    }

    public void mainMenu (PApplet p){

        p.fill(0);
        p.rect(p.width/2-150,p.height/2-50,150,50);
        p.fill(255);
        p.text("Player vs PC",p.width/2-100,p.height/2-25);

        p.fill(0);
        p.rect(p.width/2+75,p.height/2-50,150,50);
        p.fill(255);
        p.text("Player vs Player",p.width/2+100,p.height/2-25);


        if (p.mouseX >= p.width/2 - 150 && p.mouseX <= p.width/2  && p.mouseY >= p.height/2 - 50 && p.mouseY <= p.height/2 && p.mousePressed && p.mouseButton == p.LEFT) {
            rh.newGame(4,10, false);
            drawMenu = false;
        } else if (p.mouseX >= p.width/2 + 75 && p.mouseX <= p.width/2 + 225 && p.mouseY >= p.height/2 - 50 && p.mouseY <= p.height/2 && p.mouseButton == p.LEFT && p.mousePressed) {
            rh.newGame(4,10,true);
            drawMenu = false;
            startGame1 = true;


        }
    }

    public void startGame(PApplet p){
        p.fill(0);
        p.rect(p.width/2 - 50,750,135,40 );
        p.fill(255);
        p.text("Start game",p.width/2 - 25, 775);

        p.text ("Choose your mastermind color, at the bottom row.",90,250);
        if (p.mouseX >= p.width/2 - 50 && p.mouseX <= p.width/2 + 85 && p.mouseY >= 750 && p.mouseY <= 790 && p.mousePressed && p.mouseButton == p.LEFT) {
            rh.playerChoice(4, rh.getRounds().get(0));
            drawMenu = false;
            startGame1 = false;
        }
    }

    public void showRules() {
        new Rules();
    }

    @Override
    public void draw(PApplet p){

        if(drawMenu) {
            mainMenu(p);
        }
        if(startGame1){
            startGame(p);
        }
    }

    @Override
    public String getName() {
        return null;
    }

    @Override
    public void update(int curtimeMillis, PApplet p) {

    }

    public void setDrawMenu(boolean drawMenu) {
        this.drawMenu = drawMenu;
    }

    public void setStartGame1(boolean startGame1) {
        this.startGame1 = startGame1;
    }
}