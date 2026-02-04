package MultiThreading.ThreadMethods;

class MyThread extends Thread{

    @Override
    public void run() {
        System.out.println("Running.....");
    }
}
public class StartRun {
    public static void main(String[] args) {
        MyThread obj = new MyThread();
        obj.start();
    }
}

