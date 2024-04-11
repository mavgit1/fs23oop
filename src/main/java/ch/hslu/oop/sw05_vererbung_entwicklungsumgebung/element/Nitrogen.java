package ch.hslu.oop.sw05_vererbung_entwicklungsumgebung.element;

public class Nitrogen extends ChemElement {
    public Nitrogen(double tempCelsius) {
        super(tempCelsius, -210.0, -196.0); // Schmelz- und Siedepunkte für Stickstoff
    }
}
