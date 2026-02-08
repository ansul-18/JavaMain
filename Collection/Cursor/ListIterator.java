package Collection.Cursor;

import MultiThreading.ThreadMethods.Interrupted;

import java.util.ArrayList;
import java.util.List;

public class ListIterator {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(12);
        list.add(22);
        list.add(10);
        list.add(22);
        list.add(15);
        System.out.println(list);

        java.util.ListIterator<Integer> listIterator = list.listIterator();
        while(listIterator.hasNext()){
            Integer data = listIterator.next();
            if(data==22){
                listIterator.remove();
            } if(data==10){
                listIterator.add(33);
            }
        }
        System.out.println(list);
    }
}
