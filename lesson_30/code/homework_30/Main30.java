package homework_30;

import classwork.Calculator;

public class Main30 {
    public static void main (String[] args) {
        Calculator calculator = new Calculator() {
            @Override
            public double calculate( double a, double b ) {
                return a + b;
            }
            };
        System.out.println(calculator.calculate(2, 3)); // Выведет 5.0
        }
    }

