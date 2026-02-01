package Oops_1;

class Humans{
    private int age;
    private String name;

    //this key word
    public void setAge(int age){
        this.age = age;
    }
    public int getAge(){
        return age;
    }
    public void setName(String name){
        this.name = name;
    }
    public String getnName(){
        return name;
    }

}
public class SetterGetter {
    public static void main(String[] args) {
        Humans obj = new Humans();
        obj.setAge(18);
        obj.setName("Ansul");
        System.out.println("age is "+obj.getAge());
        System.out.println("Name is "+obj.getnName());
    }
}
