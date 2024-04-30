package homework;

import java.util.Scanner;

public class DepositAmount {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter initial deposit (s): ");
            double s = scanner.nextDouble();
            System.out.print("Enter number of years (n): ");
            int n = scanner.nextInt();

            double interestRate = 0.03;
            double amount = s;

            for (int i = 1; i <= n; i++) {
                amount += amount * interestRate;
            }

            System.out.println("Deposit amount after " + n + " years = " + amount);
        }
    }

