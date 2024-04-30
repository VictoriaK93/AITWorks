package homework;

import java.util.Scanner;

public class DepositRublCalculator {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter initial deposit amount (in rubles): ");
            double initialDeposit = scanner.nextDouble();
            System.out.print("Enter number of years: ");
            int numberOfYears = scanner.nextInt();

            double interestRate = 3.0 / 100;  // Convert percent to decimal
            double finalDeposit = initialDeposit * Math.pow(1 + interestRate, numberOfYears);

            System.out.println("Deposit amount after " + numberOfYears + " years: " + finalDeposit + " rubles");
        }
    }

