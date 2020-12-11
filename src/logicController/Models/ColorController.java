package logicController.Models;

public class ColorController {


    public void intToColor(int color, Pin pin) {
        if (color == 0) {
            //"Grey" - default color
            pin.setR(128);
            pin.setG(128);
            pin.setB(128);
            pin.setColorId(0);

        } else if (color == 1) {
            //"Red" color
            pin.setR(255);
            pin.setG(0);
            pin.setB(0);
            pin.setColorId(1);

        } else if (color == 2) {
            //"Green" color
            pin.setR(0);
            pin.setG(255);
            pin.setB(0);
            pin.setColorId(2);

        } else if (color == 3) {
            //"Blue" color
            pin.setR(0);
            pin.setG(0);
            pin.setB(255);
            pin.setColorId(3);

        } else if (color == 4) {
            //"White" color
            pin.setR(255);
            pin.setG(255);
            pin.setB(255);
            pin.setColorId(4);

        } else if (color == 5) {
            //"Black" color
            pin.setR(0);
            pin.setG(0);
            pin.setB(0);
            pin.setColorId(5);

        } else if (color == 6) {
            //"Yellow" color
            pin.setR(255);
            pin.setG(255);
            pin.setB(0);
            pin.setColorId(6);

        } else if (color == 7) {
            //"Brown" color
            pin.setR(139);
            pin.setG(69);
            pin.setB(19);
            pin.setColorId(7);

        } else if (color == 8) {
            //"Purple" color
            pin.setR(128);
            pin.setG(0);
            pin.setB(128);
            pin.setColorId(8);
        }
    }
}
