package MultiThreading.Synchronized;

public class MyThred6 extends Thread{
    private Counter counter;

    public MyThred6(Counter counter){
        this.counter = counter;
    }

    @Override
    public void run() {
        for (int i = 0; i < 1000; i++) {
            counter.increment();
        }

    }
}
