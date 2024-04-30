package homework;

public class SumOfOddElementsArray {
    public static int sumOfOddElements(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            if (i % 2 != 0) { // Проверяем нечетный ли индекс
                sum += array[i];
            }
        }
        return sum;
    }
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int sum = sumOfOddElements(numbers);
        System.out.println("Сумма нечетных элементов: " + sum);
    }
}

