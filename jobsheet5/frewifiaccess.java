package jobsheet5;
import java.util.Scanner;

public class frewifiaccess {
    public static void main(String[] args) {
        
    Scanner input = new Scanner(System.in);

        System.out.print("Enter user type (lecturer/student/other): ");
        String userType = input.nextLine().trim();

        if (userType.equalsIgnoreCase("lecturer")) {
            System.out.println("WiFi access granted (lecturer)");
        } else if (userType.equalsIgnoreCase("student")) {
            System.out.print("Enter number of credits taken: ");
            int credits = input.nextInt();

            if (credits >= 12) {
                System.out.println("WiFi access granted (active student)");
            } else {
                System.out.println("Access denied, credits less than 12");
            }
        } else {
            System.out.println("Access denied");
        }

        input.close();
}
}
