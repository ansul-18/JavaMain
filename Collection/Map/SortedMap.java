package Collection.Map;

import java.util.TreeMap;

public class SortedMap {
    public static void main(String[] args) {
        java.util.SortedMap<String, Integer> map = new TreeMap<>();
        map.put("vijay",54);
        map.put("rahul",53);
        map.put("Ansul",51);
        System.out.println(map);

        System.out.println(map.firstKey());

    }
}
