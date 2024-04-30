package homework;

import java.util.Objects;

public class ComputerShop {
    public static final int NUMB_LENGTH = 20;
    private double price;
    private String brand;
    private long barcode;

    public ComputerShop(double price, String brand, long barcode) {
        this.price = price;
        this.brand = brand;
        this.barcode = barcode;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public long getBarcode() {
        return barcode;
    }

    public void setBarcode(long barcode) {
        this.barcode = barcode;
    }
    private long checkBarcode(long Numb){
        if(countdigits(barcode) == NUMB_LENGTH) {
            return barcode;
        }
        return -1;
    }

    private int countdigits(long barcode) {
        int count = 0;
        do{
            count++;
            barcode = barcode/ 10;
        }while (barcode != 0);

        return count;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof ComputerShop computerShop)) return false;
        return barcode == computerShop.barcode;
    }

    @Override
    public int hashCode() {
        return Objects.hash(barcode);
    }

    @Override
    public String toString() {
        return "ComputerShop{" +
                "price=" + price +
                ", brand='" + brand + '\'' +
                ", barcode=" + barcode +
                '}';
    }
}










