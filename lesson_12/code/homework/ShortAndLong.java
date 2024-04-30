package homework;

public class ShortAndLong {
    public static String[] findShortestAndLongest(String[] strings) {
        if (strings == null || strings.length == 0) {
            return new String[]{}; // Handle empty or null input
        }

        String shortest = strings[0];
        String longest = strings[0];

        for (String str : strings) {
            if (str.length() < shortest.length()) {
                shortest = str;
            }
            if (str.length() > longest.length()) {
                longest = str;
            }
        }

        return new String[]{shortest, longest};
    }
}
