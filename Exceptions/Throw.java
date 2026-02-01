package Exceptions;

public class Throw {
    public static void main(String[] args) {
        int age =  14;
        drive(age);

    }
    public static void drive(int age){
        if(age<18){
            throw new RuntimeException("not able to drive....");
        }
        System.out.println("can be drive....");
    }
}
