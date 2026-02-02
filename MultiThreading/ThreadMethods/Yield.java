package MultiThreading.ThreadMethods;
class MyThread5 extends Thread{
    @Override
    public void run() {
        for (int i = 0; i < 6; i++) {
            System.out.println(Thread.currentThread().getName()+" is Running");
            Thread.yield();
        }

    }
}
public class Yield {
    public static void main(String[] args) {
        MyThread5 obj = new MyThread5();
        MyThread5 obj1 = new MyThread5();
        obj.start();
        obj1.start();
    }
}
