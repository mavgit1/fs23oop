package ch.hslu.oop.sw05_vererbung_entwicklungsumgebung.element;

public class ChemElement {
    protected double tempCelsius;
    protected double schmelzpunkt;
    protected double siedepunkt;

    public ChemElement(double tempCelsius, double schmelzpunkt, double siedepunkt) {
        this.tempCelsius = tempCelsius;
        this.schmelzpunkt = schmelzpunkt;
        this.siedepunkt = siedepunkt;
    }

    public String getAggregatzustand() {
        if (this.tempCelsius < schmelzpunkt) {
            return "fest";
        } else if (this.tempCelsius < siedepunkt) {
            return "flüssig";
        } else {
            return "gasförmig";
        }
    }
}
