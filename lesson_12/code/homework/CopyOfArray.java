package homework;

public class CopyOfArray {
    public static int[] copyOfArray(int[] array, int newLength) {
        if (newLength < 0 || newLength > array.length) {
            throw new IllegalArgumentException("Invalid length"); // Handle invalid input
        }

        int[] newArray = new int[newLength];
        System.arraycopy(array, 0, newArray, 0, newLength); // Efficient copying
        return newArray;
    }
}
