package Collection.Map.LinkedHashMap;

import java.util.Map;

public class LinkedHashMap {
    public static void main(String[] args) {
        Map<Integer,String> map = new java.util.LinkedHashMap<>();
        map.put(1,"A");
        map.put(3,"C");
        map.put(2,"B");
        map.put(1,"M");
        map.put(null,"M");



        System.out.println(map);
    }
}
