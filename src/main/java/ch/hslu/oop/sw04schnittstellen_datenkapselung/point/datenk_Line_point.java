package ch.hslu.oop.sw04schnittstellen_datenkapselung.point;

public class datenk_Line_point {
    private datenk_Point_point start, end;

    public datenk_Line_point(int x1, int y1, int x2, int y2) {
        this.start = new datenk_Point_point(x1, y1);
        this.end = new datenk_Point_point(x2, y2);
    }

    public datenk_Point_point getStart() {
        return new datenk_Point_point(start.getX(), start.getY());
    }

    public datenk_Point_point getEnd() {
        return new datenk_Point_point(end.getX(), end.getY());
    }

    public void setStart(datenk_Point_point start) {
        this.start = new datenk_Point_point(start.getX(), start.getY());
    }

    public void setEnd(datenk_Point_point end) {
        this.end = new datenk_Point_point(end.getX(), end.getY());
    }

    public static void main(final String[] args) {
        // Erstellen einer Linie von (0,0) bis (10,10)
        datenk_Line_point line = new datenk_Line_point(0, 0, 10, 10);
        System.out.println("Startpunkt: (" + line.getStart().getX() + ", " + line.getStart().getY() + ")");
        System.out.println("Endpunkt: (" + line.getEnd().getX() + ", " + line.getEnd().getY() + ")");

        // Ändern des Startpunkts zu (2,2)
        line.setStart(new datenk_Point_point(2, 2));
        System.out.println("Neuer Startpunkt: (" + line.getStart().getX() + ", " + line.getStart().getY() + ")");

        // Ändern des Endpunkts zu (8,8)
        line.setEnd(new datenk_Point_point(8, 8));
        System.out.println("Neuer Endpunkt: (" + line.getEnd().getX() + ", " + line.getEnd().getY() + ")");
    }

}

