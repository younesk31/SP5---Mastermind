package logicController.Models;

public class Pin {

    int r;
    int g;
    int b;
    int colorId;

    public Pin() {
        this.r = r;
        this.g = g;
        this.b = b;
        this.colorId = colorId;
    }

    public void setR(int r) {
        this.r = r;
    }

    public void setG(int g) {
        this.g = g;
    }

    public void setB(int b) {
        this.b = b;
    }

    public void setColorId(int colorId) {
        this.colorId = colorId;
    }

    public int getColorId() {
        return colorId;
    }
}
