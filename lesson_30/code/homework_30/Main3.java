package homework_30;

import classwork.Calculator;

public class Main3 {
    public static void main( String[] args) {
        Calculator calculator = (a, b) -> a + b;
        System.out.println(calculator.calculate(2, 3)); // Выведет 5.0
    }
}
