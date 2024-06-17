package coffe;

public enum Coffee {
    ESP(1,"Espresso",2.50), AMR(2, "Americano", 3.0), CAP(3, "Cappuccino", 4.5), LAT(4, "Latte", 5.0);;


    //fields
    private int number;
    private String name;
    private double price;

    Coffee(int number, String name, double price) {
        this.number = number;
        this.name = name;
        this.price = price;
    }
}

