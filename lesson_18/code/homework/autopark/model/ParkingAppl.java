package homework.autopark.model;

public class ParkingAppl {
    public static void main(String[]args) {
        Vehicle[] vehicles = new Vehicle[5];
        vehicles[0] = new Vehicle(2, 11);
        vehicles[1] = new Vehicle(2, 4);
        vehicles[2] = new Vehicle(2, 25);
        vehicles[3] = new Vehicle(2, 35);
        vehicles[4] = new Vehicle(2, 19);

        double totalAreaForParking = getArea(vehicles);
        System.out.println("Area for parking = " + totalAreaForParking);

    }

            private static double getArea(Vehicle[]vehicles){
                double totalAreaForParking = 0;
                for (int i = 0; i < vehicles.length; i++) {
                totalAreaForParking += vehicles[i].getArea();
            }
            return totalAreaForParking;


        }
    }


