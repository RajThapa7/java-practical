class Counter {
    private int count = 0;

    // Synchronized method to increment the count
    public synchronized void increment() {
        count++;
    }

    // Synchronized method to decrement the count
    public synchronized void decrement() {
        count--;
    }

    // Method to get the current count value
    public synchronized int getCount() {
        return count;
    }
}

public class ThreadSynchronization {
    public static void main(String[] args) {
        Counter counter = new Counter();

        // Creating multiple threads to modify the counter
        Thread incrementThread = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                counter.increment();
            }
        });

        Thread decrementThread = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                counter.decrement();
            }
        });

        // Start the threads
        incrementThread.start();
        decrementThread.start();

        try {
            // Wait for threads to finish execution
            incrementThread.join();
            decrementThread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Print the final count value
        System.out.println("Final Count: " + counter.getCount());
    }
}

