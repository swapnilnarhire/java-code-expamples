/*
Problem Statement:
Create two threads:
1. PrimeNumberThread: This thread should print all prime numbers between 1 and 100.
2. FibonacciThread: This thread should print the first 10 numbers in the Fibonacci sequence.
Start both threads concurrently in the main method.
*/

class PrimeNumberThread extends Thread {
    @Override
    public void run() {
        System.out.println("Prime numbers between 1 and 100:");
        for (int i = 2; i <= 100; i++) {
            if (isPrime(i)) {
                System.out.println(i);
            }
        }
    }

    // Helper method to check if a number is prime
    private boolean isPrime(int num) {
        if (num <= 1) return false;
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) return false;
        }
        return true;
    }
}

class FibonacciThread implements Runnable {
    @Override
    public void run() {
        System.out.println("First 10 Fibonacci numbers:");
        int a = 0, b = 1;
        for (int i = 0; i < 10; i++) {
            System.out.println(a);
            int next = a + b;
            a = b;
            b = next;
        }
    }
}

public class ThreadExample {
    public static void main(String[] args) {
        // Create instances of the threads
        PrimeNumberThread primeThread = new PrimeNumberThread();
        Thread fibonacciThread = new Thread(new FibonacciThread());

        // Start both threads
        primeThread.start();
        fibonacciThread.start();
    }
}
