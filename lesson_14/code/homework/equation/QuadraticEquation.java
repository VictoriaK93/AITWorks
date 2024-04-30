package homework.equation;

public class QuadraticEquation {

        private double a;
        private double b;
        private double c;

        public QuadraticEquation(double a, double b, double c) {
            this.a = a;
            this.b = b;
            this.c = c;
        }

        public double getA() {
            return a;
        }

        public void setA(double a) {
            this.a = a;
        }

        public double getB() {
            return b;
        }

        public void setB(double b) {
            this.b = b;
        }

        public double getC() {
            return c;
        }

        public void setC(double c) {
            this.c = c;
        }

        public void display() {
            System.out.println(a + "x^2 + " + b + "x + " + c + " = 0");
        }

        public double delta() {
            return b * b - 4 * a * c;
        }

        public int quantityRoots() {
            double deltaValue = delta();
            if (deltaValue > 0) {
                return 2; // Two distinct roots
            } else if (deltaValue == 0) {
                return 1; // One repeated root
            } else {
                return 0; // No real roots
            }
        }
    }

