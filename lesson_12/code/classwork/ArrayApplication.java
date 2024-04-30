package classwork;

public class ArrayApplication {
    public static void main(String[] args) {
        int[] numbers ={238, -96, 5, 57, -34, 77, -76, 33, -142, -208};
        ArraysMethods.printArray(numbers);
        int max = ArraysMethods.maxOfArray(numbers);
        System.out.println("Max of array:" + max);

        String[] dayOfWeek = {"Mo", "Tu", "We","Thu", "Fr", "Sat", "Su" };
        ArraysMethods.printArray(dayOfWeek);


    }
}
