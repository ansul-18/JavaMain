package MultiThreading.Lock;

public class Main {
    public static void main(String[] args) {
        BankAccount account = new BankAccount();
        Person pati = new Person("pati", account);
        Person patni = new Person("patni", account);
        Person child = new Person("child",account);

        pati.start();
        patni.start();
//        child.start();
    }
}
