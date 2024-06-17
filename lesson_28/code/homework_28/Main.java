package homework_28;

public class Main {


        public static void main(String[] args) {
            CarArrayList carArrayList = new CarArrayList();

            Car car1 = new Car("BMW", 2023);
            Car car2 = new Car("Toyota", 2022);
            Car car3 = new Car("Audi", 2021);

            carArrayList.add(car1);
            carArrayList.add(car2);
            carArrayList.add(car3);

            System.out.println(carArrayList.get(0)); // Выведет Car{model='BMW', year=2023}
            System.out.println(carArrayList.get(1)); // Выведет Car{model='Toyota', year=2022}
            System.out.println(carArrayList.get(2)); // Выведет Car{model='Audi', year=2021}

            Car removedCar = carArrayList.remove(1);
            System.out.println("Removed car: " + removedCar); // Выведет Car{model='Toyota', year=2022}

            System.out.println(carArrayList.get(0)); // Выведет Car{model='BMW', year=2023}
            System.out.println(carArrayList.get(1)); // Выведет Car{model='Audi', year=2021}
        }
    }

