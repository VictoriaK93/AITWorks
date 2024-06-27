package homework_41.garage.dao.model;

import java.util.function.Predicate;

public class GarageTests {

    public static void main(String[] args) {
        // Create a garage with capacity 3
        Garage garage = new GarageImpl(3);

        // Create some car objects
        Car car1 = new Car("ABC123", "BMW", "AA", 76477,"White");
        Car car2 = new Car("DEF456", "Lexus", "AA",87567,"Red");
        Car car3 = new Car("GHI789", "Audi", "AA",89856,"Black");

        // Test addCar method
        System.out.println("Adding car1: " + garage.addCar(car1));  // Output: Adding car1: true
        System.out.println("Adding car2: " + garage.addCar(car2));  // Output: Adding car2: true
        System.out.println("Adding car3: " + garage.addCar(car3));  // Output: Adding car3: true
        System.out.println("Adding another car: " + garage.addCar(new Car("JKL012", "Audi", "AA",78487,"Green"))); // Output: Adding another car: Garage is full!

        // Test findCarByRegNumber method
        System.out.println("Finding car with reg number DEF456: " + garage.findCarByRegNumber("DEF456")); // Output: Finding car with reg number DEF456: Car(regNumber=DEF456, color=Blue, modelYear=2022)

        // Test removeCar method
        System.out.println("Removing car with reg number ABC123: " + garage.removeCar("ABC123")); // Output: Removing car with reg number ABC123: Car(regNumber=ABC123, color=Red, modelYear=2020)
        System.out.println("Removing non-existent car: " + garage.removeCar("MNO345"));  // Output: Removing non-existent car: Car with registration number MNO345 not found!

        // Test findCarsByPredicate method
        Predicate<Car> redCars = car -> car.getColor().equals("Red");
        Car[] redCarArray = garage.findCarsByPredicate(redCars);
        if (redCarArray.length > 0) {
            System.out.println("Red cars in the garage:");
            for (Car car : redCarArray) {
                System.out.println(car);
            }
        } else {
            System.out.println("No red cars found in the garage.");
        }

    }
}


