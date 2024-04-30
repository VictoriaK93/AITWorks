package final_example;

public class Main3 {
    public static void main(String[] args) {
        // при попытке переопределения переменной будет ошыбка
        final double PI = 3.14;
        System.out.println("Площадь окружности с радиусом 2;" + PI * 4);

    }
}

