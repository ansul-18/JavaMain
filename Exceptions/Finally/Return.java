package Exceptions.Finally;

public class Return {
    public static void main(String[] args) {
        int res = m1();
        System.out.println(res);
    }
    public static int m1(){
        try{
            System.out.println(10/0);
            return 333;
        } catch (Exception e) {
            return 123;
        } finally {
            return 444;
        }

    }
}


