package homework;

public class TicketCalculator {
    public static double calculate(int age, boolean isStudent, boolean
            isVipSeat) {
            double standardTicketPrice = 20.0;
            double totalPrice = standardTicketPrice;

            if (age < 18) {
                totalPrice -= totalPrice * 0.25;
            } else if (isStudent) {
                totalPrice -= totalPrice * 0.10;
            }
            if (isVipSeat) {
                totalPrice += totalPrice * 0.25;
            }

            return totalPrice;
        }
}


