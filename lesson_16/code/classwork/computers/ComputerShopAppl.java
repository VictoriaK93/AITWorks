package classwork.computers;

public class ComputerShopAppl {
    public static void main(String[] args) {

        Computer[] comp = new Computer[5];

        comp[0] = new Computer("i7", 8, 256, "Asus", 1200);
        comp[1] = new Computer("i9", 16, 512, "Acer", 1800);
        comp[2] = new Laptop("M2", 16, 512, "AppleMacBook", 3000, 14, 2.15, 10);
        comp[3] = new Laptop("AMD", 64, 2000, "MCI", 3500, 21, 3.5, 4);
        comp[4] = new Laptop("Intel", 32, 1024, "MCI", 1500, 21, 3.5, 6);


        for (int i = 0; i < comp.length; i++) {
            System.out.println(comp[i]);
        }
        int sumSSD = 0;
        for (int i = 0; i < comp.length; i++) {
            sumSSD = sumSSD + comp[i].getSsd();


        }
        System.out.println("Total SSD memory =" + sumSSD);
        int totalPrice = 0;
        for (int i = 0; i < comp.length; i++) {
totalPrice += comp[i].getPrice();
        }
        System.out.println("Total price =" + totalPrice);

    }
}


