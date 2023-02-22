package LAB1;

import java.util.Scanner;

public class name {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Your First Name = ");
        String first = sc.nextLine();
        System.out.print("Enter Your Last Name = ");
        String last = sc.nextLine();

        System.out.println(first + " " + last);

    }
}