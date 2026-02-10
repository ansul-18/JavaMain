package Collection.WrapperAndGenerics;

public class Unboxing {
    public static void main(String[] args) {
        Integer i = new Integer(13);
        int i2 = i.intValue();
        System.out.println(i2);

        Character ch =new Character('w');
        char df = ch.charValue();

        int a = Integer.parseInt("12");
        System.out.println(a);
    }
}
