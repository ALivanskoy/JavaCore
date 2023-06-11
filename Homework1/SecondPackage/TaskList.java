package SecondPackage;

import FirstPackage.Task;

import java.util.ArrayList;
import java.util.List;


public class TaskList {
    private String name;
    private List<Task> tasks;

    public TaskList(String name) {
        this.name = name;
        this.tasks = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void addTask(Task task) {
        tasks.add(task);
    }

    public void removeTask(Task task) {
        tasks.remove(task);
    }

    public List<Task> getTasks() {
        return tasks;
    }

    public void markTaskAsCompleted(Task task) {
        task.complete();
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("Список задач \"").append(name).append("\":\n");
        for (Task task : tasks) {
            builder.append("- ").append(task.toString()).append("\n");
        }
        return builder.toString();
    }
}
