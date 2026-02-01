package Oops_1.Overloading;

class Calculator{
    public int add(int a,int b,int c){
        return a+b+c;
    }
    public int add(int a,int b){
        return a+b;
    }


}

public class MethodOverLoding {
    public static void main(String[] args) {
        Calculator obj = new Calculator();
        System.out.println("addition : "+obj.add(2,4,3));
        System.out.println("addition : "+obj.add(2,4));




    }
}
