package homework;

import java.util.Random;

public class FindLuckyDumpling {

        public static void main(String[] args) {
            int[][] dumplings = new int[30][2]; // Array to store dumpling weight and index

            // Simulate dumpling weights (assuming normal distribution around 50 grams)
            Random random = new Random();
            for (int i = 0; i < dumplings.length; i++) {
                dumplings[i][0] = 50 + random.nextInt(10) - 5; // Weight between 45 and 55 grams
                dumplings[i][1] = i; // Index of the dumpling
            }

            // Introduce the lucky dumpling with a coin (weight + 15 grams)
            int luckyIndex = new Random().nextInt(dumplings.length);
            dumplings[luckyIndex][0] += 15;

            // Find the lucky dumpling by comparing weights
            int luckyDumplingWeight = 0;
            int luckyDumplingIndex = -1;
            for (int[] dumpling : dumplings) {
                if (dumpling[0] > luckyDumplingWeight) {
                    luckyDumplingWeight = dumpling[0];
                    luckyDumplingIndex = dumpling[1];
                }
            }

            System.out.println("Lucky dumpling index: " + luckyDumplingIndex);
        }
    }

