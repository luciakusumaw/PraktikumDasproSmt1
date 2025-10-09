package jobsheet5;
import java.util.Scanner;

public class nestedUjianSkripsi13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Has the student been cleared of compensation? (Yes/No): ");
        String compensationStatus = sc.nextLine().trim();

        
        if (compensationStatus.equalsIgnoreCase("Y") || compensationStatus.equalsIgnoreCase("Yes")) {

            System.out.print("Enter the number of guidance logs with Supervisor 1: ");
            int supervisor1 = sc.nextInt();

            System.out.print("Enter the number of guidance logs with Supervisor 2: ");
            int supervisor2 = sc.nextInt();

            String message;

            if (supervisor1 >= 8 && supervisor2 >= 4) {
                message = "All requirements are met. The student may register for the thesis exam.";
            } else if (supervisor1 < 8 && supervisor2 < 4) {
                message = "Failed: Guidance logs with Supervisor 1 are fewer than 8 AND Supervisor 2 fewer than 4.";
            } else if (supervisor1 < 8) {
                message = "Failed: Guidance logs with Supervisor 1 are fewer than 8.";
            } else {
                message = "Failed: Guidance logs with Supervisor 2 are fewer than 4.";
            }

            System.out.println(message);

        } else {
            System.out.println("Failed: The student has not been cleared of compensation.");
        }

        sc.close();
    }
}

    
