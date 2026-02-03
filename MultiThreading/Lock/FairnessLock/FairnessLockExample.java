package MultiThreading.Lock.FairnessLock;


import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class FairnessLockExample {

    private final Lock lock = new ReentrantLock(true);

    public void accessResource(){
        lock.lock();
        try {
            System.out.println(Thread.currentThread().getName()+" acquired thr lock.");
            Thread.sleep(1000);
        } catch (Exception e) {
            throw new RuntimeException(e);
        } finally {
            System.out.println(Thread.currentThread().getName()+" release the lock.");
            lock.unlock();
        }
    }
    public static void main(String[] args) {
        FairnessLockExample obj = new FairnessLockExample();
        Runnable task = new Runnable() {
            @Override
            public void run() {
                obj.accessResource();
            }
        };
        Thread Thread1 = new Thread(task,"Thread 1");
        Thread Thread2 = new Thread(task,"Thread 2");
        Thread Thread3 = new Thread(task,"Thread 3");

        Thread1.start();
        Thread2.start();
        Thread3.start();

    }
}
