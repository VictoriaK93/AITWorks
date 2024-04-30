package homework;


public class DayTemperature {

        public static void main(String[] args) {
            int[] temperatures = {25, 26, 27, 28, 29, 30, 31}; // Sample temperatures for each day of the week

            // Print the temperature on Tuesday (index 1) and Thursday (index 3)
            System.out.println("Temperature on Tuesday: " + temperatures[1]);
            System.out.println("Temperature on Thursday: " + temperatures[3]);

            // Find the average temperature for the week
            int sum = 0;
            for (int temperature : temperatures) {
                sum += temperature;
            }

    double averageTemperature = (double) sum/ temperatures.length;
        System.out.println("Average temperature for the past week: " + averageTemperature);
}
}

