package MultiThreading.ThreadName;

class A implements Runnable{

    @Override
    public void run() {
        System.out.println("In A : "+Thread.currentThread().getName());
    }
}
public class Name {
    public static void main(String[] args) {
        Thread obj = new Thread(new A());

        String name = obj.getName();
        System.out.println("default name : "+name);

        System.out.println(Thread.currentThread().getName());
        obj.setName("MyThread");
        String UpName = obj.getName();
        obj.start();


    }
}
