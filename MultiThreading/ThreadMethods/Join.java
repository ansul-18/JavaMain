package MultiThreading.ThreadMethods;

import java.sql.SQLOutput;

class WashingMachine extends Thread{
    @Override
    public void run() {
            try {
                System.out.println("Washing start.....");
                Thread.sleep(2000);
                System.out.println("Washing done.....");
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }

public class Join {
    public static void main(String[] args) throws InterruptedException {
        WashingMachine obj = new WashingMachine();
        obj.start();

        obj.join();
        System.out.println("now dry.... ");
    }
}
