package model;


public class CarAppl {
    public static void main(String[]args) {
        Car car = new Car("white", "BMW", false, 25000, 2005, 2580000);
        car.displayCar();
        car.moveCar();

    }
}
