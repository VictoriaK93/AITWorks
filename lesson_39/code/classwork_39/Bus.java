package classwork_39;

import java.util.Objects;

public class Bus implements Comparable<Bus> {
    private String model;
    private String regNumber;
    private String route;
    private int capacity;

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getRegNumber() {
        return regNumber;
    }

    public void setRegNumber(String regNumber) {
        this.regNumber = regNumber;
    }

    public String getRoute() {
        return route;
    }

    public void setRoute(String route) {
        this.route = route;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Bus bus)) return false;
        return Objects.equals(regNumber, bus.regNumber);
    }

    @Override
    public int hashCode() {
        return Objects.hash(regNumber);
    }

    @Override
    public String toString() {
        return "Bus{" +
                "model='" + model + '\'' +
                ", regNumber='" + regNumber + '\'' +
                ", route='" + route + '\'' +
                ", capacity=" + capacity +
                '}';
    }

    public Bus(String model, String regNumber, String route, int capacity) {

        this.model = model;
        this.regNumber = regNumber;
        this.route = route;
        this.capacity = capacity;

    }

    @Override
    public int compareTo(Bus o) {
        int res = this.route.compareTo(o.route);
        return res !=0 ? res : Integer.compare(this.capacity, o.capacity); // sort by capacity from min to max
    }
}
