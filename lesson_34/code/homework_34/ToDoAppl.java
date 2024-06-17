package homework_34;

import java.util.Scanner;

import static homework_34.ToDo.printMenu;

public class ToDoAppl {
    public static void main(String[] args) {
        ToDoList toDoList = new ToDoListImpl();
        Scanner scanner = new Scanner(System.in);
        int choice;

        while (true) {
            printMenu();
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter a note: ");

            }
        }
    }
}