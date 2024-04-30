package homework;

import java.util.Scanner;

public class Factorial {

        public static long factorial(int n) {
            long result = 1;
            for (int i = 2; i <= n; i++) {
                result *= i;
            }
            return result;
        }

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter n: ");
            int n = scanner.nextInt();

            System.out.println("Factorial of " + n + " = " + factorial(n));
            System.out.println("Overflow occurs around n = 13 (for type int)");
        }
    }

