package Collection.Sets.LinkedHashSet;

import java.util.LinkedHashSet;

public class Demo {
    public static void main(String[] args) {
        LinkedHashSet<Integer> set = new LinkedHashSet<>();
        set.add(23);
        set.add(23);
        set.add(23);
        set.add(13);
        System.out.println(set);
    }
}
