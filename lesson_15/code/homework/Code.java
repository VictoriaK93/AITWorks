package homework;

public class Code {

        public static int lengthCode(long code) {
            return String.valueOf(code).length();
        }

        public static int controlSum(long code) {
            int sum = 0;
            while (code > 0) {
                sum += code % 10;
                code /= 10;
            }
            return sum;
        }

        public static boolean isValid(long code) {
            int validLength = 8; // Or 13 depending on your chosen barcode standard
            return lengthCode(code) == validLength;
        }
    }

