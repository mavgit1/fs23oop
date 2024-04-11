package ch.hslu.oop.sw05_vererbung_entwicklungsumgebung.shape;

public class Square extends Shape {
    private int side;

    public Square(int x, int y, int side) {
        super(x, y);
        this.side = side;
    }

    public int getSide() {
        return side;
    }

    @Override
    public int getPerimeter() {
        return 4 * side;
    }

    @Override
    public int getArea() {
        return side * side;
    }
}


/*
public class VeSquare extends VeRectangle {

    public VeSquare(int x, int y, int side) {
        super(x, y, side, side);
    }

    public void changeSide(int newSide) {
        // Ruft changeDimension der Superklasse auf, setzt aber beide Dimensionen auf den neuen Seitenwert
        super.changeDimension(newSide, newSide);
    }
    @Override
    public void changeDimension(int newWidth, int newHeight) {
        if(newWidth != newHeight) {
            throw new IllegalArgumentException("Für ein Quadrat müssen Breite und Höhe gleich sein.");
        }
        super.changeDimension(newWidth, newHeight);
    }
}
*/
