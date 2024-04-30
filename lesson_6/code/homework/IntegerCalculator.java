package homework;

import java.util.Scanner;

public class IntegerCalculator {
        public static void main(String[] args) {
            int num1, num2;
            int result;

            Scanner input = new Scanner(System.in);

            System.out.print("Enter the first integer number: ");
            num1 = input.nextInt();

            System.out.print("Enter the second integer number: ");
            num2 = input.nextInt();

            System.out.println("Enter operation:");
            System.out.println("1: +  2: -  3: *  4: /  5: %");
            int operation = input.nextInt();

            switch(operation) {
                case 1:
                    result = num1 + num2;
                    break;
                case 2:
                    result = num1 - num2;
                    break;
                case 3:
                    result = num1 * num2;
                    break;
                case 4:
                    if (num2 == 0) {
                        System.out.println("Cannot divide by zero.");
                        return;
                    }
                    result = num1 / num2;
                    break;
                case 5:
                    result = num1 % num2;
                    break;
                default:
                    System.out.println("Wrong operation");
                    return;
            }

            System.out.println("Result: " + result);

            input.close();
        }
    }

