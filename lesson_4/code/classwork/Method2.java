package classwork;

public class Method2 {
    public static void main(String[]args) {

        int p = 83;
        int newPrice = restDivBy5(p);
        System.out.println("New price / 5 =" + newPrice);

        int d = 60;
        System.out.println("Sum of digits" + d + " = " + sumOfDigits(d));

        int sumOfAges = 39 + 18 + 44 + 28 + 31 + 44 + 26 + 52 + 60 + 59 + 35 + 61;
        int numberOfStudents = 13;
        double a = averageAge(sumOfAges,numberOfStudents);
        System.out.println("Average age of students =" + a);
    }

    private static double averageAge(int a, int b) {
        return a/b;
    }

    public static int sumOfDigits(int d){
        int digit1FromRight = d % 10;// это деление с остатком дает нам 1-ю справа цифру
        int digit2 = d / 10;// это деление дает нам 2-ую цифру двухначного числа
        return digit1FromRight + digit2;

    }
    public static int restDivBy5(int price ){
        return price / 5;

    }
}
