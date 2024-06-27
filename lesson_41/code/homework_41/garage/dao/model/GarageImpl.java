package homework_41.garage.dao.model;


import java.util.function.Predicate;

public class GarageImpl implements Garage {
    // fields
    private Car[] cars;
    private int size;

    public GarageImpl(int capacity) {
        this.cars = new Car[capacity];
        this.size = 0;
    }

    @Override
    public boolean addCar(Car car) {
        if (size == cars.length) {
            System.out.println("Garage is full!");
        return false;
    }

    cars[size ++]=car;
        return true;
}

    @Override
    public Car removeCar(String regNumber) {
        for (int i = 0; i < size; i++) {
            if (cars[i].getRegNumber().equals(regNumber)){
                Car removedCar = cars[i];
                // Shift remaining elements to the left to fill the gap
                for (int j = 0; j < size -1; j++) {
                    cars[j] = cars[j + 1];
                }
                size--;
                return removedCar;

                }
            }

        System.out.println("Car with registration number" + regNumber +" not found!");
        return null;
    }

    @Override
    public Car findCarByRegNumber(String regNumber) {
        for (int i = 0; i < size; i++) {
            if (cars[i].getRegNumber().equals(regNumber)) {
                return cars[i];
            }
        }
        return null;
    }

    @Override
    public Car[] findCarsByPredicate(Predicate<Car> predicate) {
        int matchingCars = 0;
        // Count matching cars first to allocate correct array size
        for (Car car : cars) {
            if (predicate.test(car)) {
                matchingCars++;
            }
        }

        Car[] matchingCarsArray = new Car[matchingCars];
        int j = 0;
        // Add matching cars to a separate array
        for (Car car : cars) {
            if (predicate.test(car)) {
                matchingCarsArray[j++] = car;
            }
        }
        return matchingCarsArray;
    }

}
