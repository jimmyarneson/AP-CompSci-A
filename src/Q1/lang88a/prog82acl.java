package Q1.lang88a;
import java.util.Scanner;

public class prog82acl {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number 1-13: ");
        int num1 = input.nextInt();
        System.out.print("Enter a number 2-20: ");
        int num2 = input.nextInt();

        Class82a wow = new Class82a(num1, num2);
        wow.calc();
        int sum = wow.getsum();
        int diff = wow.getdiff();
        double prod = wow.getprod();
        double avg = wow.getavg();
        double absv = wow.getabsv();
        int min = wow.getmin();
        int max = wow.getmax();

        System.out.print("Original numbers are " + num1 + " " + num2);
        System.out.println();
        System.out.print("Sum = " + sum);
        System.out.println();
        System.out.print("Difference = " + diff);
        System.out.println();
        System.out.print("Product = " + prod);
        System.out.println();
        System.out.print("Average = " + avg);
        System.out.println();
        System.out.print("Absolute Value = " + absv);
        System.out.println();
        System.out.print("Max = " + max);
        System.out.println();
        System.out.print("Min = " + min);

    }
}
/*
Enter a number 1-13: 13
Enter a number 2-20: 20
Original numbers are 13 20
Sum = 33
Difference = -7
Product = 260.0
Average = 16.5
Absolute Value = 7.0
Max = 20
Min = 13
 */