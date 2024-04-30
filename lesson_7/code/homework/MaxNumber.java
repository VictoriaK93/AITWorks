package homework;

import java.util.Scanner;

public class MaxNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите первое число :");
        int firstNumber = scanner.nextInt();

        System.out.println("Введите второе число :");
        int secondNumber = scanner.nextInt();

        int maxNumber = Math.max(firstNumber, secondNumber);

        System.out.println("Наибольшее число" + maxNumber);

        scanner.close();
    }
}
