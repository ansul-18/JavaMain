package Collection.CopyOnWriteArrayList;

import java.util.List;

public class CopyOnWriteArrayList {
    public static void main(String[] args) {
        List<String> list = new java.util.concurrent.CopyOnWriteArrayList<>();
        list.add("Milk");
        list.add("Banana");
        list.add("Peanut");
        list.add("Bread");
        System.out.println("initial shopping list : "+list);

        for (String item : list){
            System.out.println(item);
            if (item.equals("Peanut")){
                list.add("protein");
                System.out.println("item added ");
            }

        }
        System.out.println(list);
    }
}
