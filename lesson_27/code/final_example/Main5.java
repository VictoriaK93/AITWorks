package final_example;

public class Main5 {
    public static void main(String[]args) {
        final Car car = new Car("bmw", 2008);
        car.builtYear = 2050;
        System.out.println(car);
    }
}
