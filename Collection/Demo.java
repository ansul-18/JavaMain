package Collection;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.locks.Lock;

public class Demo{
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(); //default
        List<Integer> list1 = new ArrayList<>(list); //
        List<Integer> list2 = new ArrayList<>(10); //
        list.add(10);
        list.add(110);
        list.add(160);
        list.add(120);
        list.add(130);
        System.out.println(list);

        ArrayList arrayList= new ArrayList<>();
        arrayList.add(23);
        arrayList.add(19);

        Object clone = arrayList.clone();
        System.out.println(clone);
    }
}
