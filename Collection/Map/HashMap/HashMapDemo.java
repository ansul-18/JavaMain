package Collection.Map.HashMap;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapDemo {
    public static void main(String[] args) {
        HashMap<Integer,String> map = new HashMap<>();
        map.put(101,"Ansul");
        map.put(12,"rahul");
        map.put(32,"raju");
        map.put(32,"ram");

        System.out.println(map);

        String student = map.get(12);
        System.out.println(student);

        System.out.println(map.containsKey(13));
        System.out.println(map.containsValue("Ansul"));
        System.out.println("-----------------------");

        Set<Integer> keys = map.keySet();
        for (int i : keys){
            System.out.println(map.get(i));
        }

        Set<Map.Entry<Integer, String>> entries = map.entrySet();
        for (Map.Entry<Integer, String> entry : entries){
            System.out.println(entry.getKey()+ " : "+entry.getValue());
        }
        Set<Map.Entry<Integer, String>> entrie = map.entrySet();
        for (Map.Entry<Integer, String> entry : entries){
            System.out.println(entry.getValue().toUpperCase());
        }
        System.out.println("===========");

        map.remove(12);
        System.out.println(map);
    }
}
