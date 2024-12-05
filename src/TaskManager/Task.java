package TaskManager;


class Task implements Comparable<Task> {
    private String name;
    private int priority;
    private String category;

    /**
     * Конструктор для создания задачи.
     *
     * @param name имя задачи.
     * @param priority приоритет задачи (1 - самый высокий, 3 - самый низкий).
     * @param category категория задачи ("Ошибка", "Функция", "Документация").
     * @throws IllegalArgumentException если приоритет не находится в диапазоне от 1 до 3.
     */

    public Task(String name, int priority, String category) {
        if (priority < 1 || priority > 3) {
            throw new IllegalArgumentException("Приоритет должен быть от 1 до 3.");
        }
        this.name = name;
        this.priority = priority;
        this.category = category;
    }

    public String getName() {
        return name;
    }
     /**
     * Возвращает приоритет задачи.
     *
     * @return приоритет задачи.
     */


    public int getPriority() {
        return priority;
    }

    /**
     * Возвращает категорию задачи.
     *
     * @return категория задачи.
     */

    public String getCategory() {
        return category;
    }

    @Override
    public int compareTo(Task other) {

        if (this.priority != other.priority) {
            return Integer.compare(this.priority, other.priority);
        }

        return this.category.compareTo(other.category);
    }

    @Override
    public String toString() {
        return "Task{name='" + name + "', priority=" + priority + ", category='" + category + "'}";
    }
}
