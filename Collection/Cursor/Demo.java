package Collection.Cursor;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class Demo {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>(Arrays.asList("ram","sam","rahul","ansh"));
        System.out.println(list);

        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()){
            String data = iterator.next();
            if (data.equals("rahul")){
                iterator.remove();
            } else {
                System.out.println(data);
            }
        }
        System.out.println(list);

    }
}
