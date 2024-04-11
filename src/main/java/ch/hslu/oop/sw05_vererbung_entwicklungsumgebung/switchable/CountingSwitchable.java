package ch.hslu.oop.sw05_vererbung_entwicklungsumgebung.switchable;

public interface CountingSwitchable extends Switchable {
    /**
     * Gibt die Anzahl der Schaltvorgänge zurück.
     *
     * @return die Anzahl der Schaltvorgänge.
     */
    long getSwitchCount();
}
