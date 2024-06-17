package homework_34;

import java.util.List;

public interface ToDoList {
    void addNote(String task);
    List<Task> seeAllPosts();
    void deleteEntry(int number);
}

