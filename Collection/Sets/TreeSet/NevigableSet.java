package Collection.Sets.TreeSet;

import java.util.NavigableSet;
import java.util.TreeSet;

public class NevigableSet {
    public static void main(String[] args) {
        NavigableSet<Integer> navigableSet = new TreeSet<>();
        navigableSet.add(10);
        navigableSet.add(30);
        navigableSet.add(20);
        navigableSet.add(40);
        navigableSet.add(50);
        System.out.println(navigableSet);

        int key =20;
        System.out.println("Higher than "+key+" : "+navigableSet.higher(key));
        System.out.println("lower than "+key+" : "+navigableSet.lower(key));
        System.out.println("ceiling than "+key+" : "+navigableSet.ceiling(key));
        System.out.println("floor than "+key+" : "+navigableSet.floor(key));
    }
}
