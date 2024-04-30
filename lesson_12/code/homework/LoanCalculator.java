package homework;

import java.util.Scanner;

public class LoanCalculator {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter loan amount (in thousand rubles): ");
            double loanAmount = scanner.nextDouble();
            System.out.print("Enter threshold amount for debt (in thousand rubles): ");
            double thresholdDebt = scanner.nextDouble();

            double interestRate = 10.0 / 100;  // Convert percent to decimal
            int years = 0;

            while (loanAmount < thresholdDebt) {
                loanAmount += loanAmount * interestRate;
                years++;
            }

            System.out.println("Debt will exceed " + thresholdDebt + " thousand rubles in " + years + " years.");
        }
    }

