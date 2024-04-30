package homework;

import java.util.Scanner;

public class TriAngel {
    public static void main (String[]args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите длину первой стороны:");
        double side1 = scanner.nextDouble();

        System.out.println("Введите длину второй стороны:");
        double side2 = scanner.nextDouble();

        System.out.println("Введите длину третьей стороны:");
        double side3 = scanner.nextDouble();

        if (side1 == side2 && side1 == side3) {
            System.out.println("Треугольник является равносторонним");
        } else if (side1 == side2 || side1 == side3 || side2 == side3) {
            System.out.println("Треугольник является равнобедренным");
        } else {
            System.out.println("Треугольник является разносторонним");

        }

    }
}
