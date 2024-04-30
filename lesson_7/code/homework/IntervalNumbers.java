package homework;

import java.util.Scanner;

public class IntervalNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите число:");
        double number = scanner.nextDouble();

        System.out.println("Введите начало интервала:");
        double a = scanner.nextDouble();

        System.out.println("Введите конец интервала:");
        double b = scanner.nextDouble();

        if(number >= a && number <= b) {
            System.out.println("Число" + " number" + "принадлежит интервалу [" + a + "," + b + "]");

        } else {
            System.out.println("Число" + " number" + "не принадлежит интервалу [" + a + "," + b + "]");


        }
    }
}

