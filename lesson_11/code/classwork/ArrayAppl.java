package classwork;
//*- печатает переданный в метод массив
//- заполняет переданный в метод массив случайными целыми числами в интервале от А до В
//- меняет указанные по индексам два элемента массива местами
//- находит элемент массива по индексу
//- находит максимальный элемент массива

public class ArrayAppl {
    public static void main(String[] args) {
        int[] arr = new int[10];
        printArray(arr);

        fillArray(arr, 1, 10);
        printArray(arr);


        printArray(arr);


    }//end of main

    // swap elements
    public static void swapElements(int[] arr, int n, int m) {
        int tmp = arr[m];
        arr[m] = arr[n];
        arr[n] = tmp;


    }


    // fill array with random numbers
    public static void fillArray(int[] arr, int a, int b) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * (b - a + 1) + a);
        }

        //print array
    }

    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i] + "\t");
        }
        System.out.println();


    }
}