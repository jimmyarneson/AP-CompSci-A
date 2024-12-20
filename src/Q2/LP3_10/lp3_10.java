package Q2.LP3_10;
import java.util.*;
public class lp3_10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter total number of burgers: ");
        int burgers = input.nextInt();
        System.out.print("\nEnter total number of fries: ");
        int fries = input.nextInt();
        System.out.print("\nEnter total number of sodas: ");
        int sodas = input.nextInt();
        classlp3_10 rust = new classlp3_10(burgers, fries, sodas);
        rust.calc();
        classlp3_10[] canitbechristmasalready = new classlp3_10[1];
        canitbechristmasalready[0] = rust;
        System.out.println("\n" + rust.toString());
        double Total = rust.getTotal();
        System.out.print("Enter the amount tendered: ");
        double ten = input.nextInt();
        System.out.print("\nChange: " + Math.round((ten - Total) * 100.0) / 100.0);
    }
}
/*
Enter total number of burgers: 2

Enter total number of fries: 5

Enter total number of sodas: 5

Total before tax: 13.780000000000001
Tax: 0.0
Final total: 13.780000000000001
Enter the amount tendered: 20

Change: 6.22
 */