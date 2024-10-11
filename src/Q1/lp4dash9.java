package Q1;
import com.sun.source.util.SourcePositions;

import java.util.*;

public class lp4dash9 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number 1-20: ");
        int num1 = input.nextInt();
        System.out.println();

        int max = 20;
        int min = 1;
        int range = max - min + 1;
        int secretnum = 0;
        for (int i = 0; i < 20; i++) {
            secretnum = (int)(Math.random() * range) + min;
        }
        if (num1 == secretnum) {
            System.out.println("You won!");
        } else {
            System.out.println("You lost!");
        }
        System.out.println("Your number: " + num1);
        System.out.println("Computers number " + secretnum);
    }

}
/*
Enter a number 1-20: 13

You lost!
Your number: 13
Computers number 14
 */