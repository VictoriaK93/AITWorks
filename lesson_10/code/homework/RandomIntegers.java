package homework;


import java.util.Arrays;
import java.util.Random;

public class RandomIntegers {
    public static void main(String[] args) {
        int[] randomIntegers = new int[20];
        Random rand = new Random();

        for (int i = 0; i < randomIntegers.length; i++) {
            randomIntegers[i] = rand.nextInt(11) + 10;
}
        System.out.println("Original array: " + Arrays.toString(randomIntegers));

        int temp = randomIntegers[0];
        randomIntegers[0] = randomIntegers[randomIntegers.length - 1];
        randomIntegers[randomIntegers.length - 1] = temp;

        System.out.println("Array after swapping first and last elements: " + Arrays.toString(randomIntegers));
    }
}
