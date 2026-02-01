package MultiThreading.Runnable;

public class Runnable {
    public static void main(String[] args) {
        MyRunnsble obj = new MyRunnsble();
        Thread th = new Thread(obj);

        th.start();
    }
}
