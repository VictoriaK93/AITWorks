package classwork;

public class CurrencyConvertor {
    public static void main(String[] args) {

        double money = 358.5;
        double rate = 1.07;

        double resInDollars = convertToDollars(money, rate);
        System.out.println("Result =" + resInDollars);
        System.out.printf("Result = %.2f", resInDollars);
    }

    private static double convertToDollars(double money, double rate) {
        return money * rate;
    }
}
