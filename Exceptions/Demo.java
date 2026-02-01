package Exceptions;

public class Demo {
    public static void main(String[] args) {
        System.out.println("1");

        System.out.println("2");
        try {
            System.out.println(10/0);
            System.out.println("4");
        } catch (Exception e) {
            System.out.println("3");
            System.out.println("6");
            System.out.println(e);
            System.out.println(e.getMessage());



        }
        System.out.println("5");

    }
}
