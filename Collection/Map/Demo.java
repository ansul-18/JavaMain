package Collection.Map;

import java.util.HashMap;
import java.util.Map;

public class Demo {
    public static void main(String[] args) {
        Map<Integer,String> map = new HashMap<>();
        map.put(101,"Amit");
        map.put(102,"Sumit");
        System.out.println(map.get(101));

        if (map.containsKey(101)) {
            System.out.println("yes");
        } else {
            System.out.println("No");
        }

        String no = map.getOrDefault(101, "NO");
        System.out.println(no);

        for(Map.Entry<Integer,String> entry : map.entrySet()){
            System.out.println(entry.getKey()+"-->"+entry.getValue());
        }

    }
}
