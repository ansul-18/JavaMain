package Static;

import java.awt.*;

class Mobile{
    String brand;
    int price;
    static String style;

    public void show(){
        System.out.println(brand+" : "+price+" : "+style);
    }

}
public class Demo {
    public static void main(String[] args) {
        Mobile obj1 = new Mobile();
        obj1.brand = "Apple";
        obj1.price = 80000;
        Mobile.style = "smart phone";

        Mobile obj2 = new Mobile();
        obj2.brand = "redmi";
        obj2.price = 80000;
        obj2.style = "phone";

        obj1.show();
        obj2.show();

    }
}
