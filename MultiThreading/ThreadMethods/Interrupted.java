package MultiThreading.ThreadMethods;

import java.awt.event.MouseAdapter;

class MyThread4 extends Thread{
    @Override
    public void run() {
            try {
                Thread.sleep(1000);
                System.out.println("Thread is Runnning....");
            } catch (InterruptedException e) {
                System.out.println("Thrad is interrupted!! "+e);
            }
    }
}

public class Interrupted {
    public static void main(String[] args) {
        MyThread4 obj = new MyThread4();
        obj.start();
        obj.interrupt();
    }
}
