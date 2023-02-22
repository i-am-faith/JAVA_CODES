package LAB1;

import java.util.Scanner;

class marks {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the marks of chemistry = ");
        int marks = scanner.nextInt();
        if (marks >= 90) {
            System.out.println("Your Grade is A - Excellent ");
        } else if (marks >= 80 && marks < 90) {
            System.out.println("Your Grade is B - Very Good ");
        } else if (marks >= 70 && marks < 80) {
            System.out.println("Your Grade is C - Good ");
        } else if (marks >= 60 && marks < 70) {
            System.out.println("Your Grade is D - Satisfactory ");
        } else if (marks >= 50 && marks < 60) {
            System.out.println("Your Grade is E - Work Hard ");
        } else if (marks >= 40 && marks < 50) {
            System.out.println("Your Grade is F - Just Passed ");
        } else {
            System.out.println("You are Failed !!! ");
        }

    }
}