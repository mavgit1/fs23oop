package ch.hslu.oop.sw06_polymorphie_unittest.point;

public class Line {
    private Point start, end;

    public Line(int x1, int y1, int x2, int y2) {
        this.start = new Point(x1, y1);
        this.end = new Point(x2, y2);
    }

    public Point getStart() {
        return new Point(start.getX(), start.getY());
    }

    public Point getEnd() {
        return new Point(end.getX(), end.getY());
    }

    public void setStart(Point start) {
        this.start = new Point(start.getX(), start.getY());
    }

    public void setEnd(Point end) {
        this.end = new Point(end.getX(), end.getY());
    }

    public static void main(final String[] args) {
        // Erstellen einer Linie von (0,0) bis (10,10)
        Line line = new Line(0, 0, 10, 10);
        System.out.println("Startpunkt: (" + line.getStart().getX() + ", " + line.getStart().getY() + ")");
        System.out.println("Endpunkt: (" + line.getEnd().getX() + ", " + line.getEnd().getY() + ")");

        // Ändern des Startpunkts zu (2,2)
        line.setStart(new Point(2, 2));
        System.out.println("Neuer Startpunkt: (" + line.getStart().getX() + ", " + line.getStart().getY() + ")");

        // Ändern des Endpunkts zu (8,8)
        line.setEnd(new Point(8, 8));
        System.out.println("Neuer Endpunkt: (" + line.getEnd().getX() + ", " + line.getEnd().getY() + ")");
    }

}

