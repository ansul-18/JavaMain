package MultiThreading.Executor;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorDemo {
    public static void main(String[] args) {
        ExecutorService executor = Executors.newFixedThreadPool(3);
        Runnable task1 = () ->{
            String name = Thread.currentThread().getName();
            System.out.println("Task executed by "+name);
        }; Runnable task2 = () ->{
            String name = Thread.currentThread().getName();
            System.out.println("Task executed by "+name);
        };
        for (int i = 0; i < 4; i++) {
            executor.submit(task1);
        }

        executor.shutdown();
    }
}
