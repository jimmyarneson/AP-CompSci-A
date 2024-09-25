package Q1;
import java.util.*;

public class prog65h {
    public static void main(String[] args) {
        Scanner numbers = new Scanner(System.in);

        System.out.println("Enter pounds: ");
        double pounds = numbers.nextDouble();

        System.out.println("Enter Shillings");
        double shillings = numbers.nextDouble();

        System.out.println("Enter pence: ");
        double pence = numbers.nextDouble();


        double decpounds = pounds + shillings/20 + pence/12/20;

        System.out.printf("Decimal pounds: %.2f\n", decpounds);

        // pound = 2.0 shillings
        // shilling 12 pence 0.12
        // pence = 0.012
    }

}
/*
Enter pounds:
7
Enter Shillings
17
Enter pence:
9
Decimal pounds: 7.89
 */