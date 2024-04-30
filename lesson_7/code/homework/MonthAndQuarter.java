package homework;

import java.util.Scanner;

public class MonthAndQuarter {
    public static void main(String[]args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите номер месяца:");
        int monthNumber = scanner.nextInt();

        int quarterNumber = (monthNumber - 1) / 3 + 1;
        System.out.println("Месяц" + monthNumber + "относится к" + quarterNumber + "кварталу");

        scanner.close();
    }
    }

