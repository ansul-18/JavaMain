package MultiThreading.RunnableWithMulti;

import MultiThreading.Runnable.MyRunnsble;

public class Runnable {
    public static void main(String[] args) {
        MyRunnsble obj = new MyRunnsble();
        Thread th0 =  new Thread(obj);
        Thread th1 = new Thread(obj);
        th0.start();
        th1.start();
    }
}
