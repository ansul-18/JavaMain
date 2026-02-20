package Collection.LinkedList;

import java.util.LinkedList;

public class Demo {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        list.add(10);
        list.add(1220);
        list.add(10);
        System.out.println(list);
        list.addFirst(65);
        list.add(40);
        System.out.println(list);

    }
}
