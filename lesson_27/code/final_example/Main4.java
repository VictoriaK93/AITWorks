package final_example;

public class Main4 {
    public static void main (String[]args) {
        final double[] values = {3.14};
        //нельзя преопредилить переменную values
        values[0] = 0;
        System.out.println(" Площадь окружности с радиусом 2;" + values[0] * 4);
    }
}
