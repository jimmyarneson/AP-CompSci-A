package Q1;
import java.util.Scanner;

public class lp5dash5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a positve integer: ");
        int number = input.nextInt();

             String str = Integer.toString(number);

            System.out.print(str.substring(0, 1) + "\n" + str.substring(1, 2) + "\n" + str.substring(2, 3));

    }
}
/*
Enter a positve integer: 546
5
4
6
 */