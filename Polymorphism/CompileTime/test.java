package Polymorphism.CompileTime;

class Calculator{
    public int add(int a,int b){
        return a+b;
    }
    public int add(int a,int b,int c){
        return a+b+c;
    }public double add(double a,double b){
        return a+b;
    }

}
//Method Overloading
public class test {
    public static void main(String[] args) {
        Calculator obj = new Calculator();
        System.out.println(obj.add(2,3));
        System.out.println(obj.add(2,3,4));
        System.out.println(obj.add(2.1,3.12));
    }
}
