package Oops_1;
class human{

    public human(){
        System.out.println("in constructor");
    }
    public int age(int a){
        return 6;
    }
}
public class Constructors {
    public static void main(String[] args) {
        human obj = new human();


        System.out.println(obj.age(2));
    }
}
