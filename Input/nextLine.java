package Input;

import java.util.Scanner;

public class nextLine {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter name : ");
        String name = sc.next();
        System.out.println(name);

        System.out.println("Enter full name : ");
        String fullName = sc.nextLine();
    }
}
