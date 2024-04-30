package homework;

public class MaxElement {
    public static void main(String[] args) {
        int[] array = {56, 73, 15, -10, 37, -14, 25, 65, 33, 38};

        int max = Integer.MIN_VALUE;
        int maxIndex = -1;

        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
                maxIndex = i;
            }
        }

        System.out.println("Maximum element: " + max);
        System.out.println("Index of the maximum element: " + maxIndex);
    }
}


