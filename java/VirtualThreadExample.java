// File: VirtualThreadExample.java
public class VirtualThreadExample {
    public static void main(String[] args) {
        System.out.println(" Starting Virtual Threads...");

        // Launch 5 virtual threads
        for (int i = 1; i <= 5; i++) {
            int taskId = i;

            Thread.startVirtualThread(() -> {
                System.out.println(" Virtual Thread " + taskId + " started");
                try {
                    Thread.sleep(1000); // simulate work
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }
                System.out.println(" Virtual Thread " + taskId + " finished");
            });
        }

        // Give enough time for all threads to finish
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }

        System.out.println(" All Virtual Threads Complete!");
    }
}
