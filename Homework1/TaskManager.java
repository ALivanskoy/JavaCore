import FirstPackage.Task;
import SecondPackage.TaskList;
import java.util.Scanner;

public class TaskManager {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        TaskList taskList = new TaskList("Основной");

        while (true) {
            System.out.println("Что бы вы хотели сделать?");
            System.out.println("1. Добавить задачу");
            System.out.println("2. Удалить задачу");
            System.out.println("3. Пометить задачу как завершенную");
            System.out.println("4. Показать список задач");
            System.out.println("5. Выйти из приложения");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Введите описание задачи: ");
                    String description = scanner.nextLine();
                    Task task = new Task(description);
                    taskList.addTask(task);
                    break;
                case 2:
                    System.out.print("Введите номер задачи: ");
                    int taskNumber = scanner.nextInt();
                    scanner.nextLine();
                    taskList.removeTask(taskList.getTasks().get(taskNumber - 1));
                    break;
                case 3:
                    System.out.print("Введите номер задачи: ");
                    taskNumber = scanner.nextInt();
                    scanner.nextLine();
                    taskList.markTaskAsCompleted(taskList.getTasks().get(taskNumber - 1));
                    break;
                case 4:
                    System.out.println(taskList.toString());
                    break;
                case 5:
                    System.out.println("До свидания!");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Неверный выбор. Попробуйте еще раз.");
                    break;
            }
        }
    }
}
