package Q1.lang82a;
import java.util.Scanner;

public class prog82aCl {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the speedlimit: ");
        int spe = input.nextInt();
        System.out.print("Enter speed going: ");
        int lim = input.nextInt();
        int fine = 0;

        Cl82a wowza = new Cl82a(spe, lim, fine);
        wowza.calc();
        fine = wowza.getFine();

        System.out.print("Fine $" + fine);
    }

}
/*
Enter the speedlimit: 30
Enter speed going: 42
Fine $80
 */