package Interface;


interface  A{

    int age = 10;

    void show();
    void write();
}
class B implements A{
    @Override
    public void show() {
        System.out.println("in Show...");
    }

    @Override
    public void write() {
        System.out.println("Write....");
    }

}
public class Demo {
    public static void main(String[] args) {
        A obj = new B();
        obj.show();

        System.out.println(A.age);
    }
}
