package homework;

import java.util.Scanner;

public class SumOfTax {
    public static void main (String[]args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите ваш доход:");
        int income = scanner.nextInt();
        double tax;

        if (income < 10000) {
            tax = income * 0.1;
        } else if (income < 20000) {
            tax = 1000 + (income - 10000) * 0.2;
        } else if ( income < 30000) {
            tax = 3000 + (income - 20000) * 0.3;
        } else {
            tax = 6000 + (income - 30000) * 0.4;
        }
        System.out.printf("Сумма налога: %.2f", tax);


        }
    }


