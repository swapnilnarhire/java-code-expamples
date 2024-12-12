/*
 * Problem Statement:
 * 
 * Create a class ProducerConsumer that demonstrates the producer-consumer problem using a shared queue (java.util.Queue).
 * Implement two threads:
 * - Producer: Adds numbers (1 to 10) to the queue with a delay of 500ms.
 * - Consumer: Consumes numbers from the queue and prints them.
 * Use wait() and notify() to handle inter-thread communication.
 */

import java.util.LinkedList;
import java.util.Queue;

class ProducerConsumer {
    
    // Shared queue to store numbers
    private static final Queue<Integer> queue = new LinkedList<>();
    private static final int MAX_SIZE = 5; // Max size of the queue

    // Producer thread
    static class Producer extends Thread {
        public void run() {
            for (int i = 1; i <= 10; i++) {
                try {
                    // Synchronize on the queue to ensure thread safety
                    synchronized (queue) {
                        // If the queue is full, wait until the consumer consumes an item
                        while (queue.size() == MAX_SIZE) {
                            queue.wait();
                        }
                        // Add the number to the queue
                        queue.add(i);
                        System.out.println("Produced: " + i);
                        
                        // Notify the consumer that an item has been produced
                        queue.notify();
                    }
                    
                    // Simulate delay of 500ms
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    // Consumer thread
    static class Consumer extends Thread {
        public void run() {
            while (true) {
                try {
                    // Synchronize on the queue to ensure thread safety
                    synchronized (queue) {
                        // If the queue is empty, wait until the producer produces an item
                        while (queue.isEmpty()) {
                            queue.wait();
                        }
                        // Consume the number from the queue
                        int consumed = queue.poll();
                        System.out.println("Consumed: " + consumed);
                        
                        // Notify the producer that an item has been consumed
                        queue.notify();
                    }
                    
                    // Simulate delay to slow down the consumer
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public static void main(String[] args) {
        // Create and start the producer and consumer threads
        Thread producer = new Producer();
        Thread consumer = new Consumer();
        
        producer.start();
        consumer.start();
    }
}
