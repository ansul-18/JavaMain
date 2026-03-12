package Collection.Sets.TreeSet;

import java.util.TreeSet;

public class SortedSet {
    public static void main(String[] args) {
        TreeSet<Object> sortedSet = new TreeSet<>();
            sortedSet.add(12);
            sortedSet.add(1);
            sortedSet.add(134);
            sortedSet.add(13);

        System.out.println("Sortd set : "+sortedSet);

        System.out.println("First element : "+sortedSet.first());

        System.out.println("Head Sort"+sortedSet.headSet(13));
        System.out.println(sortedSet.tailSet(13));


    }
}
