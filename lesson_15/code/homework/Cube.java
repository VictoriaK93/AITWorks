package homework;

public class Cube {

        private double side;

        public Cube(double side) {
            this.side = side;
        }

        public double getPerimeter() {
            return 12 * side;  // Perimeter is 4 times the length of an edge
        }

        public double getSurfaceArea() {
            return 6 * side * side;  // Area of 6 faces
        }

        public double getVolume() {
            return side * side * side;
        }
    }

