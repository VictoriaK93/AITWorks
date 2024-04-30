package homework;

import java.util.Scanner;

public class TrafficLight {
        public static void main(String[] args) {
            String trafficLight;

            Scanner input = new Scanner(System.in);
            System.out.print("Enter the color of the traffic light (red/yellow/green): ");
            trafficLight = input.next();

            switch(trafficLight) {
                case "red":
                    System.out.println("Stop the car");
                    break;
                case "yellow":
                    System.out.println("Prepare to stop");
                    break;
                case "green":
                    System.out.println("Go ahead");
                    break;
                default:
                    System.out.println("Invalid traffic light color entered.");
            }

            input.close();
        }
    }

