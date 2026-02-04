package InnerClasses.MemberInnerClass;

public class Test {
    public static void main(String[] args) {
        Car obj = new Car("punch");
        Car.Engine engine = obj.new Engine();
        engine.start();
        engine.stop();
    }
}
