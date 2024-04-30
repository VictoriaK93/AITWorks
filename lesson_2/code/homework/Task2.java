package homework;

public class Task2 {
    public static void main(String[]args) {

        Grandfather();
        Grandmother();
        Granddaughter();
        Dog();
        Cat();
        Mouse();


    }


    private static void Mouse() {
        System.out.println("Mouse help cat to take repka and they did take repka from underground!!!");
    }

    private static void Cat() {
        System.out.println("Cat help dog to take repka");

    }

    private static void Dog() {
        System.out.println("Dog help granddaughter to take repka");

    }

    private static void Granddaughter() {
        System.out.println("Granddaughter help  to take repka grandfather");

    }

    private static void Grandfather() {
        System.out.println("Grandfather help  to take repka grandmother");

    }

    private static void Grandmother() {
        System.out.println("Grandmother try to take repka from underground alone then whith grandfather");
    }
}
