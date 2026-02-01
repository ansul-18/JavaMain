package AccessModifier.pack1;

public class privateClass {
    private int c = 30;

    public void access(){
        print();
    }
    private void print(){
        System.out.println("Private Method : "+c);
    }
}
