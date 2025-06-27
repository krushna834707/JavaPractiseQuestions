package Encapsulation.geometry;

public class Rectangle {
    int lengt;

    int width;
    public Rectangle(int lengt,int width){
        this.lengt=lengt;
        this.width=width;
    }

    public int getLengt() {
        return lengt;
    }

    public void setLengt(int lengt) {
        this.lengt = lengt;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }
}
