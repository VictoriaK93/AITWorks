package homework_34;

public class ToDo {
    public static void printMenu() {
        System.out.println("\n** To Do List App **");
        for (MenuOption option : MenuOption.values()) {
            System.out.println(option.getNumber() + ". " + option.getAction());
        }
    }
}
