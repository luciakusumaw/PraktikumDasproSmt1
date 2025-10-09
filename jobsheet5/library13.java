package jobsheet5;
import java.util.Scanner;
public class library13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String hasID, registeredOnline;

        System.out.print("Does the student have ID? (yes/no): ");
        hasID = sc.nextLine().trim();

        System.out.print("Is the student registered online? (yes/no): ");
        registeredOnline = sc.nextLine().trim();

        if (hasID.equalsIgnoreCase("yes") || registeredOnline.equalsIgnoreCase("yes")) {
            System.out.println("Allowed Entry.");
        } else {
            System.out.println("Access Denied.");
        }
    }}