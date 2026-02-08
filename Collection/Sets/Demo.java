package Collection.Sets;

import java.util.HashSet;
import java.util.Set;

public class Demo {
    public static void main(String[] args) {
        Set<Integer> set = new HashSet<>();
        set.add(23);
        set.add(213);
        set.add(null);
        set.add(3);
        set.add(3);
        set.add(13);

        System.out.println(set);
    }
}
