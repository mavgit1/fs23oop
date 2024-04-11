package ch.hslu.oop.sw05_vererbung_entwicklungsumgebung.shape;

public class Circle extends Shape {
    private int diameter;

    public Circle(int x, int y, int diameter) {
        super(x, y); // Aufruf des Konstruktors der Basisklasse
        this.diameter = diameter;
    }

    public void setDiameter(int diameter) {
        this.diameter = diameter;
    }

    public int getDiameter() {
        return diameter;
    }

    @Override
    public int getPerimeter() {
        return (int) Math.round(Math.PI * diameter);
    }

    @Override
    public int getArea() {
        int radius = diameter / 2;
        return (int) Math.round(Math.PI * radius * radius);
    }
}

