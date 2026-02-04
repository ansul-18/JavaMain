package Polymorphism.RunTime;

public class Test {
    public static void main(String[] args) {
        Animal dog = new Dog();
        dog.sayHello();

//        Animal dog1 = new Dog();
//        dog1.sayBye

        Dog bob =  new Dog();
        bob.sayBye();
    }
}
