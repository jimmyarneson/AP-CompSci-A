package Q1;
import java.util.Scanner;

public class lp5dash6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a positive integer: ");
        int number = input.nextInt();

        int num1 = number/100;
        int num2 = number%10;

        System.out.print("The sum of the digits is: " + num1 + num2);

    }
}