package Collection.Map;

import java.util.HashMap;
import java.util.Map;

public class FrequenyCount {
    public static void main(String[] args) {
        int[] arr = {1,2,2,3,4,1};
        Map<Integer,Integer> map = new HashMap<>();
        for(int n : arr){
            map.put(n,map.getOrDefault(n,0)+1);
        }
        System.out.println(map);

        System.out.println();
    }
}
