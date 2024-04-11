package ch.hslu.oop.sw04schnittstellen_datenkapselung.switchable;

/**
 * Definiert ein umschaltbares Verhalten.
 * Dieses Interface ermöglicht das Ein- und Ausschalten sowie das Überprüfen des Zustands eines Objekts.
 */
public interface SWSwitchable {
    /**
     * Schaltet das Objekt ein.
     */
    void switchOn();

    /**
     * Schaltet das Objekt aus.
     */
    void switchOff();

    /**
     * Überprüft, ob das Objekt eingeschaltet ist.
     *
     * @return {@code true}, wenn das Objekt eingeschaltet ist; sonst {@code false}.
     */
    boolean isSwitchedOn();

    /**
     * Überprüft, ob das Objekt ausgeschaltet ist.
     *
     * @return {@code true}, wenn das Objekt ausgeschaltet ist; sonst {@code false}.
     */
    boolean isSwitchedOff();
}