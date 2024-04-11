package ch.hslu.oop.sw06_polymorphie_unittest.element;

public class Mercury extends ChemElement {
    private static final double schmelzpunkt = -38.83; // Schmelzpunkt in Grad Celsius
    private static final double siedepunkt = 356.73; // Siedepunkt in Grad Celsius

    public Mercury(double tempCelsius) {
        super(tempCelsius);
    }

    @Override
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
        // Verwendung der toString()-Methode der Oberklasse und Anhängen des Warnhinweises
        return super.toString() + " ACHTUNG ES IST GIFTIG";
    }

    /*
    public static void main(final String[] args) {
        Mercury test = new Mercury(3.0);
        System.out.println(test.toString());
    }
    */
}
