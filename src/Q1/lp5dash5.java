package Q1;
import java.util.Scanner;

public class lp5dash5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a positve integer: ");
        int number = input.nextInt();

        while (number > 0) {
            int remainder = number % 10;
            Integer.toString(remainder);

            System.out.println(Integer.substring(-1));



            number = number /10;
        }

    }
}