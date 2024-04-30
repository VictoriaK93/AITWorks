package classwork;

//Задать целочисленные переменные х и у, выполнить с ними известные вам математические действия,
// напечатать результаты вместе c текстовыми пояснениями;
//- какие переменные участвовали;
//- какие действия с ними аыполнялись;
//- что получилось в результате.

public class MathOperations {
    public static void main(String[]args){
        int x = 12;
        int y = 30;

        int res = x + y;
        System.out.println("x = "+ x +" sum y = " + y + " gives " + res);
        res = x - y;
        System.out.println ("x = "+ x +" deduct y = " + y + " gives " + res);
        res = x * y;
        System.out.println ("x = "+ x +" multiply y = " + y + " gives " + res);
        res = y / x;
        System.out.println ("y = "+ y +" division (/) by x = " + x + " gives " + res);
        res = y % x;
        System.out.println ("y = "+ y +" division (%) by x = " + x + " gives " + res + " (rest) ");


    }
}
