package ch.hslu.oop.sw03_selektion_iteration;

public class Temperature {
    private double tempCelsius;

    public Temperature(double tempCelsius) {
        this.tempCelsius = tempCelsius;
    }

    public Temperature() {
        this.tempCelsius = 20.0;
    }

    public double getTempCelsius() {
        return this.tempCelsius;
    }

    public double getTempKelvin() {
        return this.tempCelsius + 273.15;
    }

    public double getTempFarenheit() {
        return this.tempCelsius * 1.8 + 32.0;
    }

    public void setTempCelsius(double tempCelsius) {
        this.tempCelsius = tempCelsius;
    }

    public void changTempCelsius(double changeTempCelsius) {
        this.tempCelsius += changeTempCelsius;
    }

    public String getAggregatzustand(String element) {
        double schmelzpunkt;
        double siedepunkt;

        // Schmelz- und Siedepunkte
        switch (element) {
            case "N": // Stickstoff
                schmelzpunkt = -210.0;
                siedepunkt = -196.0;
                break;
            case "Hg": // Quecksilber
                schmelzpunkt = -38.83;
                siedepunkt = 356.73;
                break;
            case "Pb": // Blei
                schmelzpunkt = 327.5;
                siedepunkt = 1744;
                break;
            default:
                return "unbekanntes Element";
        }

        // Bestimmung des Aggregatzustands basierend auf der aktuellen Temperatur
        if (this.tempCelsius < schmelzpunkt) {
            return "fest";
        } else if (this.tempCelsius >= schmelzpunkt && this.tempCelsius < siedepunkt) {
            return "flüssig";
        } else if (this.tempCelsius >= siedepunkt) {
            return "gasförmig";
        }

        return "Fehler bei der Bestimmung des Aggregatzustands";
    }
}