package Q1;
import java.util.Scanner;

public class lp5dash6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a positive integer: ");
        int number = input.nextInt();
        int sum = 0;

        while(number > 0) {
            sum = sum + number % 10;
            number = number / 10;
        }

        System.out.print("The sum of the digits is: " + sum);

    }
}
/*
 Enter a positive integer: 837
The sum of the digits is: 18
 */