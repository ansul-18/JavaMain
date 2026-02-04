package InnerClasses.MemberInnerClass;

public class Car {
    private String name;
    private boolean isEngineOn;

    public Car(String name){
        this.name = name;
        this.isEngineOn = false;
    }

    class Engine {
        void start(){
            if(!isEngineOn){
                isEngineOn = true;
                System.out.println(name + " engine started.");
            } else {
                System.out.println(name +" engine is not on.");
            }
        }
        void stop(){
            if(!isEngineOn){
                System.out.println(name + " engine stopped.");
            } else {
                isEngineOn = false;
                System.out.println(name +" engine is not on.");
            }
        }

    }
}
