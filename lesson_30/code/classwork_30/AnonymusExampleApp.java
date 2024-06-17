package classwork_30;

public class AnonymusExampleApp {
    public static void main (String[] args) {
        Greeting myObject = new Greeting() {
            public void sayHello() {
                System.out.println("Hello from anonymous class");
            }

        };
        myObject.sayHello();
    }
}
