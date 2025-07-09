// File: CallableExample.java
import java.util.concurrent.*;

public class CallableExample {
    public static void main(String[] args) {
        // Create a fixed thread pool with 3 threads
        ExecutorService executor = Executors.newFixedThreadPool(3);

        // Define a Callable task
        Callable<String> task = () -> {
            Thread.sleep(1000); // simulate delay
            return " Task completed by " + Thread.currentThread().getName();
        };

        // Submit tasks and collect Futures
        Future<String> future1 = executor.submit(task);
        Future<String> future2 = executor.submit(task);
        Future<String> future3 = executor.submit(task);

        try {
            // Retrieve results from each task
            System.out.println(future1.get());
            System.out.println(future2.get());
            System.out.println(future3.get());
        } catch (InterruptedException | ExecutionException e) {
            System.out.println(" Error: " + e.getMessage());
        }

        executor.shutdown(); // Always shut down the executor
    }
}
