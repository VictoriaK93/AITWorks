package homework;
// Task 2. Write an application that calculates the area of a parallelogram given its base and height.


public class AreaOfParallelogram {
    public static void main(String[] args) {
        double b = 10 ;
        double h = 8;

        double area = b * h;
        System.out.println("Area of parallelogram with = "+ b + " height = " + h + " = " + area);

        double res = areaOfParallelogram(b, h);
        System.out.println("Area =" + res);

    }

    private static double areaOfParallelogram(double a, double b) {
        return a * b;
    }
}





