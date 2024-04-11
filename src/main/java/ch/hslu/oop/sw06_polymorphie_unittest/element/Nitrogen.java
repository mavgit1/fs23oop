package ch.hslu.oop.sw06_polymorphie_unittest.element;

public class Nitrogen extends ChemElement {
    public Nitrogen(double tempCelsius) {
        super(tempCelsius, -210.0, -196.0); // Schmelz- und Siedepunkte für Stickstoff
    }
}
