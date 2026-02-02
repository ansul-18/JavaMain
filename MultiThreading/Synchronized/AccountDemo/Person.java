package MultiThreading.Synchronized.AccountDemo;

public class Person extends Thread{

    BankAccount account;

    Person(String name, BankAccount account){
        super(name);
        this.account = account;
    }
    @Override
    public void run() {
        account.withdraw(5000);
    }
}
