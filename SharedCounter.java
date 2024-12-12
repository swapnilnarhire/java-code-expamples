/*
Problem Statement:
Create a shared resource class called SharedCounter with a counter variable.
Implement a synchronized method increment() to increase the counter by 1.
Add a method getCount() to print the current counter value.
Create multiple threads (3 threads) that call the increment() method 100 times each.
Ensure the SharedCounter is thread-safe and display the final value of the counter.
*/

public class SharedCounter {
    // Counter variable to be shared among threads
    private int count = 0;

    // Synchronized method to ensure thread-safety while incrementing the counter
    public synchronized void increment() {
        count++;
    }

    // Method to get the current counter value
    public void getCount() {
        System.out.println("Current Count: " + count);
    }

    public static void main(String[] args) throws InterruptedException {
        SharedCounter sharedCounter = new SharedCounter();

        // Create 3 threads that will call the increment() method 100 times each
        Thread thread1 = new Thread(() -> {
            for (int i = 0; i < 100; i++) {
                sharedCounter.increment();
            }
        });

        Thread thread2 = new Thread(() -> {
            for (int i = 0; i < 100; i++) {
                sharedCounter.increment();
            }
        });

        Thread thread3 = new Thread(() -> {
            for (int i = 0; i < 100; i++) {
                sharedCounter.increment();
            }
        });

        // Start the threads
        thread1.start();
        thread2.start();
        thread3.start();

        // Wait for all threads to finish
        thread1.join();
        thread2.join();
        thread3.join();

        // Display the final value of the counter
        sharedCounter.getCount();  // Expected output: 300
    }
}
