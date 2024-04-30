package homework;

public class ArithmeticMeanOfElementsArray {
    public static double calculateMean(int[] array) {
        int sum = 0;
        for (int num : array) {
            sum += num;
        }
        return (double) sum / array.length;
    }
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        double mean = calculateMean(numbers);
        System.out.println("Mean: " + mean);
    }
}
