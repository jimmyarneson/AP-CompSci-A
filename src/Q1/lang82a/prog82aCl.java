package Q1.lang82a;
import java.util.Scanner;

public class prog82aCl {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the speedlimit: ");
        int speedlimit = input.nextInt();
        System.out.print("Enter speed going: ");
        int speedgoing = input.nextInt();

        Cl82a wowza = new Cl82a(speedlimit, speedgoing);
            int fine = wowza.getFine();

        System.out.print("Fine $" + fine);
    }

}
