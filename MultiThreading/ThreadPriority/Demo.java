package MultiThreading.ThreadPriority;

class MyThread implements Runnable{

    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println("In "+Thread.currentThread().getName());
        }

    }
}

public class Demo {
    public static void main(String[] args) {
        Thread obj1 = new Thread(new MyThread(),"Thread-1");
        Thread obj2 = new Thread(new MyThread(),"Thread-2");

//        obj1.start();
        obj1.setPriority(Thread.MIN_PRIORITY);
        obj2.setPriority(Thread.MAX_PRIORITY);

        obj1.start();
        obj2.start();

    }
}
