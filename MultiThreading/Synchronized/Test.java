package MultiThreading.Synchronized;

public class Test {
    public static void main(String[] args) {
        Counter counter = new Counter();
        MyThred6 obj1 = new MyThred6(counter);
        MyThred6 obj2 = new MyThred6(counter);

        obj1.start();
        obj2.start();
        try {
            obj1.join();
            obj2.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        System.out.println(counter.getCount());

    }
}
