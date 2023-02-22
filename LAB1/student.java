package LAB1;
import java.util.Scanner;

public class student {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        for (int i = 1; i <= 3; i++) {
            System.out.println("Enter details for user " + i + ":");
            System.out.print("Name: ");
            String name = scanner.nextLine();
            System.out.print("Roll no: ");
            String rollNo = scanner.nextLine();
            System.out.print("Section: ");
            String section = scanner.nextLine();
            System.out.print("Branch: ");
            String branch = scanner.nextLine();
            
            System.out.println("Details for user " + i + ":");
            System.out.println("Name: " + name);
            System.out.println("Roll no: " + rollNo);
            System.out.println("Section: " + section);
            System.out.println("Branch: " + branch);
        }
        
        scanner.close();
    }
}
