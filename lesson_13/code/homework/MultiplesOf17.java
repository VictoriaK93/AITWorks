package homework;

public class MultiplesOf17 {
        public static void main(String[] args) {
            int product = 1;
            for (int i = 17; i <= 99; i += 34) {
                product *= i;
            }
            System.out.println("Product = " + product);
        }
    }

