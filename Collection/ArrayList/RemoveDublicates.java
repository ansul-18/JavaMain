package Collection.ArrayList;

import MultiThreading.ThreadMethods.Interrupted;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

public class RemoveDublicates {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(2,4,21,21,53,2));
        System.out.println(list);

        ArrayList<Integer> unique = new ArrayList<>();

        for (Integer data : list) {
            if(!unique.contains(data)){
                unique.add(data);
            }
        }
        System.out.println(unique);
    }
}
