package homework_34;

import java.util.ArrayList;
import java.util.List;

public class ToDoListImpl implements ToDoList {
    private List<Task> tasks;
    private int currentId;

    public ToDoListImpl() {
        this.tasks = new ArrayList<>();
        this.currentId = 1;
    }

    @Override
    public void addNote(String task) {
        tasks.add(new Task(currentId++, task, tasks.size() + 1));
    }

    @Override
    public List<Task> seeAllPosts() {
        return tasks;
    }

    @Override
    public void deleteEntry(int number) {
        int index = number - 1; // Adjust for zero-based indexing
        if (index >= 0 && index < tasks.size()) {
            tasks.remove(index);
            // Update task numbers after deletion for sorting
            for (int i = index; i < tasks.size(); i++) {
                tasks.get(i).setTaskNumber(i + 1);
            }
        } else {
            System.out.println("Invalid entry number!");
        }
    }
}



