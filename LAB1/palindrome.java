package LAB1;

import java.util.Scanner;

public class palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number = ");
        int n = sc.nextInt();
        int r;
        int sum = 0;
        int temp = n;
        while (n > 0) {
            r = n % 10;
            sum = (sum * 10) + r;
            n = n / 10;
        }
        if(temp == sum)
        {
            System.out.println("Palindrome successfully detected");
        }
        else
        {
            System.out.println("The input number is not a palindrome");
        }
    }
}
