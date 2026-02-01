package MultiThreading;


import java.util.TreeMap;

class A extends Thread {
    public void run(){
        for (int i = 0; i < 10; i++) {
            System.out.println("Thread A : "+i+" "+Thread.currentThread().getName());
        }

    }
}
class B extends Thread{
    public void run(){
        for (int i = 0; i < 10; i++) {
            System.out.println("Thread B : "+i+" "+ Thread.currentThread().getName());
        }

    }
}
public class FirstProg {
    public static void main(String[] args) {
        A obj1 = new A();
        B obj2 = new B();
        System.out.println(Thread.currentThread().getName());

        obj1.start();
        obj2.start();
    }
}
