package final_example;

public class Car {
    public String vendor;
    public int builtYear;

    @Override
    public String toString() {
        return "Car{" +
                "vendor='" + vendor + '\'' +
                ", builtYear=" + builtYear +
                '}';
    }

    public Car(String vendor, int builtYear) {
        this.vendor = vendor;
        this.builtYear = builtYear;
    }
}
