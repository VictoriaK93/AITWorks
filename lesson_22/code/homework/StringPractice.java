package homework;

public class StringPractice {
    public static void main(String[] args) {
    String str = "I'm proud to learn Java! Java is the most famous programming language!!!";

    // Распечатать последний символ строки
    System.out.println(str.charAt(str.length() - 1)); // !

    // Найти позицию подстроки “Java” в строке
    System.out.println(str.indexOf("Java")); // 14

    // Проверить, содержит ли заданная строка подстроку “Java”
    System.out.println(str.contains("Java")); // true

    // Заменить все символы “o” на “a”
    System.out.println(str.replace('o', 'a')); // I'm pr'aud t' learn Java! Java is the m'st fam'us pr'gramming language!!!

    // Преобразуйте строку к верхнему регистру
    System.out.println(str.toUpperCase()); // I'M PROUD TO LEARN JAVA! JAVA IS THE MOST FAMOUS PROGRAMMING LANGUAGE!!!

    // Преобразуйте строку к нижнему регистру
    System.out.println(str.toLowerCase()); // i'm proud to learn java! java is the most famous programming language!!!

    // Вырезать подстроку Java c помощью метода substring()
    System.out.println(str.substring(14, 18)); // Java

    // Проверить, заканчивается ли строка подстрокой “!!!”
    System.out.println(str.endsWith("!!!")); // true

    // Проверить, начинается ли строка подстрокой “I'm proud”
    System.out.println(str.startsWith("I'm proud")); // true
}
}

