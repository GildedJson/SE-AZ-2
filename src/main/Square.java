package main;

public class Square {
    private int length;

    public int computeArea(){
        return length * length;
    }

    public Square(int length) {
        this.length = length;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }
}
