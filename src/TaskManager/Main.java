package TaskManager;

public class Main {
    public static void main(String[] args) {
        TaskManager taskManager = new TaskManager();

        taskManager.addTask(new Task("Исправить ошибку входа", 1, "Ошибка"));
        taskManager.addTask(new Task("Написать документацию API", 3, "Документация"));
        taskManager.addTask(new Task("Реализовать функцию поиска", 2, "Функция"));
        taskManager.addTask(new Task("Исправить ошибку выхода", 1, "Ошибка"));
        taskManager.addTask(new Task("Обновить руководство пользователя", 2, "Документация"));
        taskManager.addTask(new Task("Добавить фильтры в поиск", 2, "Функция"));


        System.out.println("Задачи в порядке выполнения:");
        taskManager.printAllTasks();
    }

}
