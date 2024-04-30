package classwork;

import java.util.Scanner;

public class Evaluation {
    public static void main(String[]args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Which mark have you got today?");
        int mark = scanner.nextInt();
        int timeForGame = 60;

        switch (mark) {
            case 1: {
                System.out.println("Good job!");
                timeForGame = timeForGame + 30;
                System.out.println("Time for game:"+ timeForGame);
                break;
            }
            case 2: {
                System.out.println("Good!");
                System.out.println("Time for game:" + timeForGame);
                break;
            }
            case 3: {
                timeForGame = timeForGame - 30;
                System.out.println("Time for game:" + timeForGame);
                break;
            }

            case 4: {
                    System.out.println("Very bad!");
                    timeForGame = 0;
                    System.out.println("No game today!");
                    break;
                }
                default : {
                    System.out.println(" Wrong input !");
                }
                }
            }
        }


