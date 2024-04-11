package ch.hslu.oop.sw05_vererbung_entwicklungsumgebung.shape;

public abstract class Shape {
    protected int x;
    protected int y;

    public Shape(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void move(int newX, int newY) {
        this.x = newX;
        this.y = newY;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    // Abstrakte Methoden, die von den Unterklassen implementiert werden müssen
    public abstract int getPerimeter();
    public abstract int getArea();
}
