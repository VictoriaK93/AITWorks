package homework;

import java.util.Arrays;

public class ExpandsAnArray {
    public static void expandArray(int[] array) {
        for (int i = array.length - 1; i >= 1; i--) {
            array[i] = array[i - 1];
        }
        array[0] = 0;
    }

    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        expandArray(numbers);
        System.out.println("Expanded array: " + Arrays.toString(numbers));
    }
}


