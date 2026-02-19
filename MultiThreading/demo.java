package MultiThreading;

class MyThread extends Thread{
    @Override
    public void run() {
        System.out.println("dasdgadf");
    }
}
public class demo {
    public static void main(String[] args) {
MyThread thread = new MyThread();
thread.run();
    }
}
