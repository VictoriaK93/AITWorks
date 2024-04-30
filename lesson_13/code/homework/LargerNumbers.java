package homework;

import java.util.Scanner;

public class LargerNumbers {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            for (int i = 1; i <= 10; i++) {
                System.out.print("Enter pair " + i + ": ");
                int num1 = scanner.nextInt();
                int num2 = scanner.nextInt();
                int larger = (num1 > num2) ? num1 : num2;
                System.out.println("Larger number in pair " + i + " = " + larger);
            }
        }
    }

