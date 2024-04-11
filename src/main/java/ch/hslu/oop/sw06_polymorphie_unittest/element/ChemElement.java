package ch.hslu.oop.sw06_polymorphie_unittest.element;

public class ChemElement {
    protected double tempCelsius;
    protected double schmelzpunkt;
    protected double siedepunkt;

    public ChemElement(double tempCelsius) {
        this.tempCelsius = tempCelsius;
    }

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

    @Override
    public String toString() {
        return getClass().getName() + '@' + Integer.toHexString(hashCode());
    }
}
