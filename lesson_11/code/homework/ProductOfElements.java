package homework;

public class ProductOfElements {
    public static int productOfElementsWithEvenIndices(int[] array) {
        int product = 1;
        for (int i = 0; i < array.length; i++) {
            if (i % 2 == 0) { // Проверяем четный ли индекс
                product *= array[i];
            }

        }
        return product;
    }

    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int product = productOfElementsWithEvenIndices(numbers);
        System.out.println("Произведение элементов с четными индексами: " + product);
    }
}
