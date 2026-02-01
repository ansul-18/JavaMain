package Encapsulation;

public class Demo {
    public static void main(String[] args) {
        Human obj = new Human();
        obj.setAge(18);
        obj.setName("Ansul");
        System.out.println(obj.getAge());
        System.out.println(obj.getName());
    }
}
