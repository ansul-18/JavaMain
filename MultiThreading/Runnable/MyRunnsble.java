package MultiThreading.Runnable;

import java.lang.Runnable;
import java.util.TreeMap;

public class MyRunnsble implements Runnable {

    @Override
    public void run() {
        for (int i = 0; i < 6; i++) {
            System.out.println("In MyTread "+Thread.currentThread().getName());
        }

    }
}
