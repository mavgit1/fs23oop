package ch.hslu.oop.sw06_polymorphie_unittest.calculator;

public class Calculator implements CalculatorInterface {

    @Override
    public long addition(int summand1, int summand2) {
        return (long) summand1 + (long) summand2;
    }
}
