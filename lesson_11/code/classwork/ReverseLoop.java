package classwork;

public class ReverseLoop {
    public static void main(String[]args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        printReverseArr(arr);

    }
    public static void printReverseArr(int[]arr){
        for (int i = arr.length - 1; i >= 0 ; i--) {
            System.out.print(arr[i] + "\t");
        }
        System.out.println();
    }
}
