package homework;


import java.util.Scanner;

public class MonthToSeasons {
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);

            System.out.print("Enter a number from 1 to 12 representing a month: ");
            int month = input.nextInt();

            switch(month) {
                case 12:
                case 1:
                case 2:
                    System.out.println("Winter");
                    break;
                case 3:
                case 4:
                case 5:
                    System.out.println("Spring");
                    break;
                case 6:
                case 7:
                case 8:
                    System.out.println("Summer");
                    break;
                case 9:
                case 10:
                case 11:
                    System.out.println("Fall/Autumn");
                    break;
                default:
                    System.out.println("Invalid month entered.");
            }

            input.close();
        }
    }


