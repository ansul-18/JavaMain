package Oops_1.SuperAndThisMethod;


class A {

    public A(){
        super();
        System.out.println("in A");
    }
    public A(int a){
        this();
        System.out.println("in int A");
    }
}
class B extends A{

    public B(){
        //for parenty use super
        super(3);
        System.out.println("in B");
    }
    public B(int b){
        //current(Child class) use this
        this();
        System.out.println("in int B");
    }
}
public class Super {
    public static void main(String[] args) {
        B obj = new B(2);
    }
}
