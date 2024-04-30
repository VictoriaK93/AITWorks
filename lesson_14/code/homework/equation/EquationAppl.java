package homework.equation;

public class EquationAppl {

        public static void main(String[] args) {
            QuadraticEquation eq1 = new QuadraticEquation(2, 4, -6);
            QuadraticEquation eq2 = new QuadraticEquation(3, 6, 3);
            QuadraticEquation eq3 = new QuadraticEquation(1, -5, 6);

            System.out.println("Equation 1:");
            eq1.display();
            System.out.println("Delta: " + eq1.delta());
            System.out.println("Quantity of roots: " + eq1.quantityRoots());
            System.out.println();

            System.out.println("Equation 2:");
            eq2.display();
            System.out.println("Delta: " + eq2.delta());
            System.out.println("Quantity of roots: " + eq2.quantityRoots());
            System.out.println();

            System.out.println("Equation 3:");
            eq3.display();
            System.out.println("Delta: " + eq3.delta());
            System.out.println("Quantity of roots: " + eq3.quantityRoots());
        }
    }

