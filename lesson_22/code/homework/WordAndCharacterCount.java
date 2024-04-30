package homework;

    import java.util.Scanner;

    public class WordAndCharacterCount {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Введите строку: ");
            String str = scanner.nextLine();

            // Подсчет слов
            int wordCount = 1;
            for (int i = 0; i < str.length() - 1; i++) {
                if (str.charAt(i) == ' ' && str.charAt(i + 1) != ' ') {
                    wordCount++;
                }
            }

            // Подсчет символов
            int charCount = str.length();

            // Печать строки задом наперед
            StringBuilder reversedStr = new StringBuilder(str);
            reversedStr.reverse();
            System.out.println("Перевернутая строка: " + reversedStr);

            System.out.println("Количество слов: " + wordCount);
            System.out.println("Количество символов: " + charCount);
        }
    }

