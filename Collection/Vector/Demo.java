package Collection.Vector;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.List;
import java.util.Vector;

public class Demo {
    public static void main(String[] args) {
        Vector<Integer> vector = new Vector<>();
        System.out.println(vector.capacity());

        vector.add(12);
        vector.add(156);
        vector.add(124);
        System.out.println(vector);

        System.out.println("-----vector Enumeration------");
        Enumeration<Integer> enumeration = vector.elements();
        while (enumeration.hasMoreElements()){
            Integer data = enumeration.nextElement();
            System.out.println(data);
        }
        System.out.println("-----vector iterator------");
        Iterator<Integer> iterator = vector.iterator();
        while (iterator.hasNext()){
            Integer next = iterator.next();
            System.out.println(next);
        }



    }
}
