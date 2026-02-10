package Collection.Generics;

class pair<K,V>{
    K key;
    V value;

    public pair(K key, V value) {
        this.key = key;
        this.value = value;
    }
}
public class main {
    public static void main(String[] args) {
        Gift<Integer> gift = new Gift<>();

        gift.setValue(10);
        gift.setValue(144);

        System.out.println(gift.getValue());

        Gift<String > stringGift = new Gift<>();
        stringGift.setValue("Hello");

        //---------------------------
        pair<Integer,String> p1 = new pair<>(123,"ans");
        pair<String,Integer> p2 = new pair<>("aggg",345);
        


    }
}
