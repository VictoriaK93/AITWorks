package classwork;

public class ArraysMethods {


    //bubble sort
    // comparing two elements of array: array[i]? array[i + 1]
    // if left > right, swap
    public static int[] bubbleSort(int[]array){
        for (int i = 0; i < array.length -1; i++) {
            for (int j = 0; j < array.length -1 - i; j++) {// правый конец будет двигаться к началу масива
                if(array[j] > array[j+ 1]){
                    // swap
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;


                }


            }

        }
        return array;
    }

    //print array int[]
    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " "); // print current element of array
        }
        System.out.println();
    }

    // print array String[]
    public static void printArray(String[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " "); // print current element of array
        }
        System.out.println();
    }

    // max element of int[]
    public static int maxOfArray(int[] array) {
        int max = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        return max;
    }

    // index of max element
    public static int indexMaxOfArray(int[] array) {
        int max = array[0];
        int indexOfMax = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
                indexOfMax = i;
            }
        }
        return indexOfMax;
    }

    public static void fillArray(int[] arr, int a, int b) { // fill array with random numbers
        for (int i = 0; i < arr.length; i++) {
            arr[i] =(int) (Math.random() * (b-a + 1) + a);

        }
    }
    private static void fillNewArray(int[] array, int[] newArray) {
        for (int i = 0, j = 0; j < newArray.length; i++) {
            if(array[i] < 0){
                newArray[j++] = array[i];
            }
        }
    }

    private static int countNegativeElementsInArray(int[] array) {
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if( array[i] < 0 ) {
                count++;
            }
        }
        return count;
    }




    }







