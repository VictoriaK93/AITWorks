package classwork;

public class Circus {
    public static void main(String[]args) {
        // проверить, можна ли из одного метода вызвать другой,а из того дальше следующий...
        lightOn();
        entrtrainer();
        lightOff();
    } // end of main

    private static void lightOff() {
        System.out.println("Light OFF");
    }
    private static void entrtrainer() {
        jogger();
        cloun();
        singer();
    }

    private static void singer() {
        System.out.println("I'm singing in the rain...");
    }

    private static void cloun() {
        System.out.println("I'm joking");
    }

    private static void jogger() {
        System.out.println("I'm jogger, i'm joging");
    }

    private static void lightOn() {
        System.out.println("Light is On");
    }
}
