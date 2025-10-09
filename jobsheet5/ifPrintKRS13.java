import java.util.Scanner;
public class ifPrintKRS13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("--- Print KRS SIAKAD ---");
        System.out.print("Has the UKT been fully paid? (True/False): ");
        boolean uktPaid = sc.nextBoolean();

        if (uktPaid) {
            System.out.println("UKT payment verified");
            System.out.println("Please print your KRS and get your DPA signature");
        }
    }
}