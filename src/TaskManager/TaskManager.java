package TaskManager;

import java.util.PriorityQueue;

class TaskManager {
    private PriorityQueue<Task> taskQueue;

    public TaskManager() {

        this.taskQueue = new PriorityQueue<>();
    }

    public void addTask(Task task) {
        taskQueue.offer(task);
    }

    public Task pollTask() {
        return taskQueue.poll();
    }

    public boolean isEmpty() {
        return taskQueue.isEmpty();
    }

    public void printAllTasks() {
        while (!isEmpty()) {
            System.out.println(pollTask());
        }
    }
}
