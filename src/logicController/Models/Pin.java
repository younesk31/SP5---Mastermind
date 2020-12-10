package logicController.Models;

public class Pin {

    int r;
    int g;
    int b;
    int colorId;
    boolean checked;

    int pinx;
    int piny;


    public Pin() {
        this.r = r;
        this.g = g;
        this.b = b;
        this.colorId = colorId;
        this.checked = false;

    }

    public int getColorId() {
        return colorId;
    }

    public void setColorId(int colorId) {
        this.colorId = colorId;
    }

    public int getR() {
        return r;
    }

    public void setR(int r) {
        this.r = r;
    }

    public int getG() {
        return g;
    }

    public void setG(int g) {
        this.g = g;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public boolean getChecked() {
        return checked;
    }

    public void setChecked(boolean b) {
        this.checked = b;
    }

    public int getPinx() {
        return pinx;
    }

    public void setPinx(int pinx) {
        this.pinx = pinx;
    }

    public int getPiny() {
        return piny;
    }

    public void setPiny(int piny) {
        this.piny = piny;
    }
}
