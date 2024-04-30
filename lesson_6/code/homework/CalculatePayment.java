package homework;


import java.util.Scanner;

public class CalculatePayment {
        public static void main(String[] args) {
            final double BASE_SALARY = 500.0;
            double bonusPercentage;

            Scanner input = new Scanner(System.in);

            System.out.print("Enter the number of years the employee has worked: ");
            int yearsWorked = input.nextInt();

            if (yearsWorked >= 15) {
                bonusPercentage = 1.5;
            } else if (yearsWorked >= 10) {
                bonusPercentage = 1.0;
            } else if (yearsWorked >= 5) {
                bonusPercentage = 0.5;
            } else if (yearsWorked >= 3) {
                bonusPercentage = 0.1;
            } else {
                bonusPercentage = 0.0;
            }

            double totalPayment = BASE_SALARY + (BASE_SALARY * bonusPercentage);

            System.out.println("Total payment for the employee: $" + totalPayment);

            input.close();
        }
    }

