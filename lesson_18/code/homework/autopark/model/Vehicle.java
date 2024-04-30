package homework.autopark.model;

public class Vehicle {
    private double c;
    private double g;

    public Vehicle(double c, double g) {
        this.c = c;
        this.g = g;
    }

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }

    public double getG() {
        return g;
    }


    public void setG(double g) {
        this.g = g;

    }
    public double getArea(){
        return c * g;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "c=" + c +
                ", g=" + g +
                '}';
    }


}




