package Collection.Sets.OrderAndUnorder;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class Order {
    public static void main(String[] args) {
        Set<Integer> set = new LinkedHashSet<>();
        set.add(10);
        set.add(12);
        set.add(4);
        set.add(22);
        set.add(4);
        System.out.println(set);
    }


}
