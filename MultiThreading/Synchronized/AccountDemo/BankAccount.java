package MultiThreading.Synchronized.AccountDemo;

public class BankAccount {

    private int bal = 10000;

    public synchronized void withdraw(int amount){
        System.out.println(Thread.currentThread().getName()+" attempting to withdraw : "+amount);
        if(amount<=bal){
            System.out.println(Thread.currentThread().getName()+" proceeding to withdraw.....");
            try {
                Thread.sleep(10000);
            } catch (InterruptedException e) {
                System.out.println("Exception occur");
            }
            bal = bal-amount;
            System.out.println(Thread.currentThread().getName()+" complete withdrawal. Remaining balance "+bal);
        } else {
            System.out.println(Thread.currentThread().getName()+" insufficient balance");
        }
    }
}
