package Inheritance.Calculator;

public class Calculator {
    public static void main(String[] args) {
        Calc c = new Calc();
        int r1 = c.add(2,3);
        System.out.println(r1);

        int r2 = c.mul(2,4);
        System.out.println(r2);
    }
}
