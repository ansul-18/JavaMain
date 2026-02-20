package Collection.ArrayList;

import MultiThreading.ThreadMethods.Interrupted;

import java.util.*;

public class Basics {
    public static void main(String[] args) {
        ArrayList<String> name = new ArrayList<>();

        name.add("A");
        name.add("B");
        name.add("C");
        name.add("D");
        System.out.println(name);

        name.add(2,"E");
        System.out.println(name);

        name.remove(2);
        System.out.println(name);

        System.out.println("------------");
        String[] str = {"A","B","C","D"};
        System.out.println(Arrays.toString(str));
        List<String> list = new ArrayList<>(Arrays.asList(str));
        System.out.println(list);

        //sorting
        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(34);
        list1.add(4);
        list1.add(20);
        list1.add(1);

        Collections.sort(list1);
        System.out.println(list1);


    }
}
