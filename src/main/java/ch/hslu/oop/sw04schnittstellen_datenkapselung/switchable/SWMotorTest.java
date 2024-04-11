package ch.hslu.oop.sw04schnittstellen_datenkapselung.switchable;

public class SWMotorTest {
    public static void main(String[] args) {
        SWMotor motor = new SWMotor();
        System.out.println("Is the motor on? " + motor.isSwitchedOn()); // Sollte false ausgeben
        motor.switchOn();
        System.out.println("Is the motor on? " + motor.isSwitchedOn()); // Sollte true ausgeben
        motor.switchOff();
        System.out.println("Is the motor on? " + motor.isSwitchedOn()); // Sollte wieder false ausgeben
    }
}