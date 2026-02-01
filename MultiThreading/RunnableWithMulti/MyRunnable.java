package MultiThreading.RunnableWithMulti;

import java.lang.Runnable;
public class MyRunnable implements Runnable {

    @Override
    public void run() {
        for (int i = 0; i < 6; i++) {
            System.out.println("In MyRunnable "+Thread.currentThread().getName());
        }

    }
}
