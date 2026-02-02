package MultiThreading.Lock;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class BankAccount {

    private int bal = 10000;

    private Lock lock = new ReentrantLock();

    public void withdraw(int amount){
        System.out.println(Thread.currentThread().getName()+" attempting to withdraw : "+amount);
        try {
            if(lock.tryLock(1000, TimeUnit.MILLISECONDS)){
                if(bal>=amount){
                    try {
                        System.out.println(Thread.currentThread().getName()+" proceeding to withdraw.....");
                        Thread.sleep(3000);
                        bal = bal-amount;
                        System.out.println(Thread.currentThread().getName()+" complete withdrawal. Remaining balance "+bal);
                    } catch (Exception e) {
                        Thread.currentThread().interrupt();
                    } finally {
                        lock.unlock();
                    }
                } else {
                    System.out.println(Thread.currentThread().getName()+" insufficient balance");
                }
            } else{
                System.out.println(Thread.currentThread().getName()+" could not acquire the lock, will try later");
            }
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}
