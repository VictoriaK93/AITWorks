package classwork;
//*Задание 1.
//В программе задаются два целых числа.
//Найдите минимальное из них с помощью тернарного оператора.
//Дополните программу возможностью ввода чисел пользователем.

public class TernaryOperator {
    public static void main(String[]args) {

        int a = -145;
        int b = -85;

        int min = ( a < b) ? a : b; // это тернарный оператор

        System.out.println("Minimum" + min);

    }
}
