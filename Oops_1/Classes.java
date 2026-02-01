package Oops_1;

class Dog{
    String name;
    int age;
    String color;

    public void show(){
        System.out.println("name : "+name );
        System.out.println("age : "+age );
        System.out.println("color : "+color );
    }

}
class Cat{

}
public class Classes {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.name = "tommy";
        d.age = 24;
        d.color = "black";
        d.show();

        Cat c = new Cat();


    }

}
