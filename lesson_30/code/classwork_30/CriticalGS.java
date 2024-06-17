package classwork_30;

public class CriticalGS {
    public static void main(String[] args) {
                System.out.println(
                        "Человек идет по улице и встречает " +
                                "группу моргинальных личностей"
                );

        System.out.println(" И тут он говорит:");
        Greeting speech = new Greeting() {
            @Override
            public void sayHello() {
                System.out.println("Здарова мужики");
            }
            @Override
            public void sayGoodbye() {
                System.out.println("Бывайте");
            }
        };
        speech.sayHello();
        speech.sayGoodbye();

        System.out.println("история закончилась");

    }
}
