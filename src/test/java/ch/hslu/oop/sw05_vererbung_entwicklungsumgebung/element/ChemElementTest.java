package ch.hslu.oop.sw05_vererbung_entwicklungsumgebung.element;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ChemElementTest {

    @Test
    public void testGetAggregatzustandFest() {
        ChemElement nitrogen = new Nitrogen(-220.0); // Temperatur unter dem Schmelzpunkt
        assertEquals("fest", nitrogen.getAggregatzustand(), "Stickstoff sollte bei -220°C fest sein.");
    }

    @Test
    public void testGetAggregatzustandFluessig() {
        ChemElement nitrogen = new Nitrogen(-210.0); // Temperatur zwischen Schmelz- und Siedepunkt
        assertEquals("flüssig", nitrogen.getAggregatzustand(), "Stickstoff sollte bei -210°C flüssig geworden sein.");
    }

    @Test
    public void testGetAggregatzustandGasfoermig() {
        ChemElement nitrogen = new Nitrogen(-196.0); // Temperatur über dem Siedepunkt
        assertEquals("gasförmig", nitrogen.getAggregatzustand(), "Stickstoff sollte bei -180°C gasförmig geworden sein.");
    }
}
