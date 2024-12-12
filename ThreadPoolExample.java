/*
 * Problem Statement:
 * Create a thread pool using ExecutorService.
 * Submit 5 tasks to the thread pool where each task prints:
 * 1. The thread name (Thread.currentThread().getName()).
 * 2. A unique task identifier (e.g., "Task 1", "Task 2", etc.).
 * Ensure the thread pool shuts down gracefully after completing all tasks.
 */

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadPoolExample {

    public static void main(String[] args) {
        // Create a thread pool with 3 threads
        ExecutorService executorService = Executors.newFixedThreadPool(3);

        // Submit 5 tasks to the thread pool
        for (int i = 1; i <= 5; i++) {
            int taskId = i;
            executorService.submit(() -> {
                // Print the thread name and task identifier
                System.out.println("Thread: " + Thread.currentThread().getName() + " - Task: Task " + taskId);
            });
        }

        // Shutdown the executor service gracefully
        executorService.shutdown();
        try {
            // Wait for all tasks to finish before exiting
            while (!executorService.isTerminated()) {
                // Wait for tasks to finish
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("All tasks are completed!");
    }
}
