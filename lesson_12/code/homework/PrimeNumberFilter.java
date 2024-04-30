package homework;

import java.util.Arrays;

public class PrimeNumberFilter {

        public static int[] filterPrimeNumbers(int[] numbers) {
            int count = 0;
            for (int num : numbers) {
                if (isPrime(num)) {
                    count++;
                }
            }

            int[] primeNumbers = new int[count];
            int index = 0;
            for (int num : numbers) {
                if (isPrime(num)) {
                    primeNumbers[index++] = num;
                }
            }

            return primeNumbers;
        }

        private static boolean isPrime(int num) {
            if (num <= 1) {
                return false;
            }
            for (int i = 2; i <= Math.sqrt(num); i++) {
                if (num % i == 0) {
                    return false;
                }
            }
            return true;
        }

        public static void main(String[] args) {
            int[] numbers = {0, 13, -25, 11, 31, 55, 98, 11, 5};
            int[] primeNumbers = filterPrimeNumbers(numbers);
            System.out.println("Prime numbers: " + Arrays.toString(primeNumbers));
        }
    }

