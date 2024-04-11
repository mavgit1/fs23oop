package ch.hslu.oop.sw06_polymorphie_unittest.point;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestPoint {

    @Test
    public void testMoveRelativeWithXY() {
        Point point = new Point(5, 5);

        // Test vor der Verschiebung
        assertEquals(5, point.getX(), "X-Wert nach Erstellung sollte 5 sein");
        assertEquals(5, point.getY(), "Y-Wert nach Erstellung sollte 5 sein");

        // Verschieben des Punktes
        point.moveRelative(3, -2);

        // Test nach der Verschiebung
        assertEquals(8, point.getX(), "X-Wert nach Verschiebung sollte 8 sein.");
        assertEquals(3, point.getY(), "Y-Wert nach Verschiebung sollte 3 sein.");
    }

    @Test
    public void testMoveRelativeWithPoint() {
        Point point = new Point(10, 10);
        Point vector = new Point(2, -3);

        // Test vor der Verschiebung
        assertEquals(10, point.getX(), "X-Wert nach Erstellung sollte 10 sein");
        assertEquals(10, point.getY(), "Y-Wert nach Erstellung sollte 10 sein");

        // Verschieben des Punktes
        point.moveRelative(vector);

        // Test nach der Verschiebung
        assertEquals(12, point.getX(), "X-Wert nach Verschiebung sollte 12 sein.");
        assertEquals(7, point.getY(), "Y-Wert nach Verschiebung sollte 7 sein.");
    }

    @Test
    public void testMoveRelativeWithPolarCoordinates() {
        Point point = new Point(5, 7);

        point.movePolar(13.5, 10.1);
        assertEquals(15, point.getX(), "X-Wert sollte 15 sein.");
        assertEquals(9, point.getY(), "Y-Wert sollte 9 sein.");

        point.movePolar(180.0, 15.0);
        point.movePolar(270d, 9d);

        assertEquals(0, point.getX(), "X-Wert sollte 0 sein.");
        assertEquals(0, point.getY(), "Y-Wert sollte 0 sein.");
    }


}
