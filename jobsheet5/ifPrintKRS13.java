package jobsheet5;
import java.util.Scanner;
public class ifPrintKRS13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("--- Print KRS SIAKAD ---");
        System.out.print("Has UKT been paid? (True/False): ");
        boolean uktPaid = sc.nextBoolean();

        if (uktPaid) {
            System.out.println("UKT payment verified");
            System.out.println("Print your KRS and ask the DPA signature");
        } else {
            System.out.println("Registration rejected. Please pay UKT first.");
        }
    }
}
