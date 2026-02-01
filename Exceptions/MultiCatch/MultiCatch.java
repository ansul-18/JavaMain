package Exceptions.MultiCatch;

public class MultiCatch {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4};
        try {
            System.out.println(10/1);
            System.out.println(arr[5]);
        } catch (ArithmeticException e){
            System.out.println(e);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e);
        } catch (Exception e) {
            System.out.println(e);
        }

    }

}
