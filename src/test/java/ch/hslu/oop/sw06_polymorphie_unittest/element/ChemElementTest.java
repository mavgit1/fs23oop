package ch.hslu.oop.sw06_polymorphie_unittest.element;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ChemElementTest {

    @Test
    public void testGetAggregatzustandFestNitrogen() {
        ChemElement nitrogen = new Nitrogen(-220.0); // Temperatur unter dem Schmelzpunkt
        assertEquals("fest", nitrogen.getAggregatzustand(), "Stickstoff sollte bei -220°C fest sein.");
    }

    @Test
    public void testGetAggregatzustandFluessigNitrogen() {
        ChemElement nitrogen = new Nitrogen(-210.0); // Temperatur zwischen Schmelz- und Siedepunkt
        assertEquals("flüssig", nitrogen.getAggregatzustand(), "Stickstoff sollte bei -210°C flüssig geworden sein.");
    }

    @Test
    public void testGetAggregatzustandGasfoermigNitrogen() {
        ChemElement nitrogen = new Nitrogen(-196.0); // Temperatur über dem Siedepunkt
        assertEquals("gasförmig", nitrogen.getAggregatzustand(), "Stickstoff sollte bei -180°C gasförmig geworden sein.");
    }

    @Test
    public void testGetAggregatzustandFestMercury() {
        ChemElement mercury = new Mercury(-50.0); // Temperatur unter dem Schmelzpunkt
        assertEquals("fest", mercury.getAggregatzustand(), "Quecksilber sollte bei -50°C fest sein.");
    }

    @Test
    public void testGetAggregatzustandFluessigMercury() {
        ChemElement mercury = new Mercury(-38.83); // Temperatur zwischen Schmelz- und Siedepunkt
        assertEquals("flüssig", mercury.getAggregatzustand(), "Quecksilber sollte bei -38.83°C flüssig geworden sein.");
    }

    @Test
    public void testGetAggregatzustandGasfoermigMercury() {
        ChemElement mercury = new Mercury(356.73); // Temperatur über dem Siedepunkt
        assertEquals("gasförmig", mercury.getAggregatzustand(), "Quecksilber sollte bei 356.73°C gasförmig geworden sein.");
    }
}
