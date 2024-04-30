package homework;

public class CubeAppl {


        public static void main(String[] args) {
            Cube cube1 = new Cube(5);
            Cube cube2 = new Cube(10);

            System.out.println("Cube 1:");
            System.out.println("  Perimeter: " + cube1.getPerimeter());
            System.out.println("  Surface Area: " + cube1.getSurfaceArea());
            System.out.println("  Volume: " + cube1.getVolume());

            System.out.println("\nCube 2:");
            System.out.println("  Perimeter: " + cube2.getPerimeter());
            System.out.println("  Surface Area: " + cube2.getSurfaceArea());
            System.out.println("  Volume: " + cube2.getVolume());
        }
    }

