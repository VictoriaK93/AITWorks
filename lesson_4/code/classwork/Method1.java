package classwork;

public class Method1 {


    public static void main(String[]args) {
        int x = 56;
        x = absolute(x);
        System.out.println("x =" + x);

        double a = 10.0d; // задаем действительное число
        System.out.println("Cub =" + cubOfNumber(a));

        int z = 58;
        System.out.println( z + "rest of division by 2 =" + restDivisionBy2(z));

    }
    public static int restDivisionBy2(int z){
        return z % 2;

    }

    public static double cubOfNumber(double z){
        return z * z * z;
    }

    public static int absolute(int number) {// это сигнатура метода(1-я строчка)
        return -number;


    }
}
