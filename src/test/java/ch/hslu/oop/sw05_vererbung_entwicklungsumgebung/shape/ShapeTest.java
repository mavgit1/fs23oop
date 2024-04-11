package ch.hslu.oop.sw05_vererbung_entwicklungsumgebung.shape;

import org.testng.annotations.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ShapeTest {

    @Test
    public void testCircle() {
        // Erstellen eines Circle-Objekts
        Circle circle = new Circle(0, 0, 10); // x, y, diameter

        // Testen des Durchmessers
        assertEquals(10, circle.getDiameter());

        // Testen der Fläche (Annahme: Math.PI * (radius * radius))
        assertEquals((int) Math.round(Math.PI * 25), circle.getArea(), "Die Fläche des Kreises ist nicht korrekt.");

        // Testen des Umfangs (Annahme: Math.PI * diameter)
        assertEquals((int) Math.round(Math.PI * 10), circle.getPerimeter(), "Der Umfang des Kreises ist nicht korrekt.");

        // Testen der Setter-Methode
        circle.setDiameter(20);
        assertEquals(20, circle.getDiameter(), "Der Durchmesser des Kreises nach dem Setzen ist nicht korrekt.");
    }

    @Test
    public void testRectangle() {
        // Erstellen eines Rectangle-Objekts
        Rectangle rectangle = new Rectangle(0, 0, 10, 5); // x, y, width, height

        // Testen von Breite und Höhe
        assertEquals(10, rectangle.getWidth(), "Die Breite des Rechtecks ist nicht korrekt.");
        assertEquals(5, rectangle.getHeight(), "Die Höhe des Rechtecks ist nicht korrekt.");

        // Testen der Fläche (Annahme: width * height)
        assertEquals(50, rectangle.getArea(), "Die Fläche des Rechtecks ist nicht korrekt.");

        // Testen des Umfangs (Annahme: 2 * (width + height))
        assertEquals(30, rectangle.getPerimeter(), "Der Umfang des Rechtecks ist nicht korrekt.");

        // Testen der changeDimension Methode
        rectangle.changeDimension(20, 10);
        assertEquals(20, rectangle.getWidth(), "Die Breite des Rechtecks nach der Größenänderung ist nicht korrekt.");
        assertEquals(10, rectangle.getHeight(), "Die Höhe des Rechtecks nach der Größenänderung ist nicht korrekt.");
    }
}
