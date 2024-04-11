package ch.hslu.oop.sw06_polymorphie_unittest.point;

public class Point {
    private int x, y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public Point(Point point) {
        this(point.getX(), point.getY()); // ruft public Point(int x, int y) auf
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void moveRelative(int dx, int dy) {
        this.x += dx;
        this.y += dy;
    }

    public void moveRelative(Point vector) {
        this.x += vector.getX();
        this.y += vector.getY();
    }

    public void movePolar(double angle, double radius) {
        // Berechnung der Verschiebung
        double dx = radius * Math.cos(angle);
        double dy = radius * Math.sin(angle);

        int intdx = (int) Math.round(dx);
        int intdy = (int) Math.round(dy);

        this.x += intdx;
        this.y += intdy;
    }

    /*
    public int polarToCartesian(double angle, double radius, boolean xTrueYFalse) {
        double angleInRadians = Math.toRadians(angle);

        if (xTrueYFalse) {
            // Berechnung der Verschiebung
            double dx = radius * Math.cos(angleInRadians);
            // Konvertierung zu int
            int intdx = (int) Math.round(dx);
            return intdx;
        } else {
            // Berechnung der Verschiebung
            double dy = radius * Math.sin(angleInRadians);
            // Konvertierung zu int
            int intdy = (int) Math.round(dy);
            return intdy;
        }
    }

     */
}
