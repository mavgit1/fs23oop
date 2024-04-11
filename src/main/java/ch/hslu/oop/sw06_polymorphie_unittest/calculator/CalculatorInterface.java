package ch.hslu.oop.sw06_polymorphie_unittest.calculator;

/**
 * Definiert die methoden des calculator.
 */
public interface CalculatorInterface {
    /**
     * Addiert 2 Zahlen
     * @param summand1 erster Summand (Zahl) der Addition
     * @param summand2 zweiter Summand (Zahl) der Addition
     * @return die Summe beider Summanden
     */
    long addition(int summand1, int summand2);
}
