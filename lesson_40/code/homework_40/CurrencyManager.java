package homework_40;

import java.util.HashSet;
import java.util.Scanner;

    public class CurrencyManager {

        private static final Scanner scanner = new Scanner(System.in);
        private static final HashSet<String> currencies = new HashSet<>();

        public static void main(String[] args) {
            while (true) {
                System.out.println("Enter currency code (e.g., USD, EUR, JPY) or 'q' to quit:");
                String currency = scanner.nextLine().toUpperCase();

                if (currency.equals("Q")) {
                    break;
                }

                if (!currencies.add(currency)) {
                    System.out.println("Duplicate currency found!'" + currency + "' already exists.");
                } else {
                    System.out.println("Currency '" + currency + "' added successfully.");
                }
            }

            System.out.println("Exiting program...");
        }
    }

