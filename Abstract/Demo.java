package Abstract;

abstract class  car{

    public abstract void drive();
    public abstract void fly();

    public void music(){
        System.out.println("playing music....");
    }
}
abstract class safari extends car {

    @Override
    public void drive() {
        System.out.println("safari is driving....");
    }
}
class ModifiedSafari extends safari{

    public void fly(){
        System.out.println("car can fly...");
    }
}
public class Demo {
    public static void main(String[] args) {
        car obj = new ModifiedSafari();
        obj.drive();
        obj.music();
        obj.fly();
    }
}
