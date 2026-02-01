package AccessModifier.pack2;
import AccessModifier.pack1.*;

public class TestAccess extends protectedClass {
    public static void main(String[] args) {

        publicClass pb = new publicClass();
        pb.show();

        TestAccess pt = new TestAccess();
        pt.display();

        privateClass pr = new privateClass();
        pr.access();

        // DEFAULT → NOT accessible (different package)
        // defaultClass d = new defaultClass(); ❌ ERROR
    }
}
