package Collection.Sets;

import java.util.Set;
import java.util.TreeSet;

public class Sorted {
    public static void main(String[] args) {
        Set<Integer> set = new TreeSet<>();
        set.add(10);
        set.add(1);
        set.add(13);
        set.add(10);
        System.out.println(set);
    }
}
