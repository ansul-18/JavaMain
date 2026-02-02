package MultiThreading.ThreadMethods;

class MyThread3 extends Thread{
    public MyThread3(String name){
        super(name);
    }

    @Override
    public void run() {
        for (int i = 0; i < 6; i++) {
            System.out.println(Thread.currentThread().getName()+" : "+"Piority - "+Thread.currentThread().getPriority()+" -> "+i);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

    }
}
public class SetPriority {
    public static void main(String[] args) {
        MyThread3 l = new MyThread3("low(1) Priority Thread");
        MyThread3 m = new MyThread3("medium(2) Priority Thread");
        MyThread3 h = new MyThread3("High(3) Priority Thread");
        l.setPriority(Thread.MIN_PRIORITY);
        m.setPriority(Thread.NORM_PRIORITY);
        h.setPriority(Thread.MAX_PRIORITY);

        l.start();
        m.start();
        h.start();
    }
}
