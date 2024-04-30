package homework;

public class PurchaseCalculator {
    public static void main(String[] args) {
        double productACost = 20; // X euros
        double productADiscount = 10; // D%
        int nGoodsA = 3; // N goods A

        double productBCost = 30; // Y euros
        double productBDiscount = 20; // C%
        int mGoodsB = 2; // M goods B

        double totalCost = (productACost * nGoodsA * (100 - productADiscount) / 100) + (productBCost * mGoodsB * (100 - productBDiscount) / 100);

        if (totalCost > 100) {
            totalCost = totalCost * 0.95; // additional 5% discount
        }

        double discountAmount = (productACost * nGoodsA * productADiscount / 100) + (productBCost * mGoodsB * productBDiscount / 100) - totalCost;

        System.out.println("Total cost of the purchase: " + totalCost + " euros");
        System.out.println("Amount of discount received: " + discountAmount + " euros");
    }
}

