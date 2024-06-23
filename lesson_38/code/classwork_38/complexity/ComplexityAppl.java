package classwork_38.complexity;
//заведем простой массив целых чисел
//будем выполнять с ним различные операции:
// - вычисление среднего значения,
//   - поиск элемента,
//- поиск мин и макс,
// сортировка
//оценим вычислительную сложность используемых алгоритмов

import java.util.Arrays;

public class ComplexityAppl {
    public static void main(String[] args) {
        int[] array = {12, 17, 43, 115, -28, -4, -35};

        int sum = 0;// 1 операция О(1)
        for (int i = 0; i < array.length; i++) { // О(n) -растет кол-во операций прямо пропорционально кол-ву элементов
            sum += array[i];// О(1)
        }

        double avg = (double) sum / array.length;// О(1)
        System.out.println("Average = " + avg);

        // Общая сложность: О(1) + О(n) + О(1) + O(1) = O(n)
        System.out.println("Before sorting: ");
        System.out.println(Arrays.toString(array));

        int index = Arrays.binarySearch(array, 100);
        System.out.println(index);

        // сортируем массив Bubble Sort
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - 1 - i; j++) {
                if (array[j] > array[j + 1]) { // O(1)
                    // переставим элементы местами
                    int temp = array[j];// O(1)
                    array[j] = array[j + 1];//O(1)
                    array[j + 1] = temp;//O(1)
                }
            }
        }

        // это квадратичная сложность О(n^2)
        System.out.println("After sorting");
        System.out.println(Arrays.toString(array));

        index = Arrays.binarySearch(array,100);
        System.out.println(index);

        index = Arrays.binarySearch(array, 115);
        System.out.println(index);

        Arrays.sort(array);// полилинейная сложность О(n*log(n))
        System.out.println("After sorting");
        System.out.println(Arrays.toString(array));
    }
}



