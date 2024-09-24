package Q1;
import com.sun.source.util.SourcePositions;

import java.util.*;
import java.util.Scanner;

public class prog58h {
    public static void main(String[] args) {

        Scanner numbers = new Scanner(System.in);

        System.out.println("Amount Saved: ");
        double p = numbers.nextDouble();
        System.out.println();

        System.out.println("Interest Rate? ");
        double r = numbers.nextDouble();
        System.out.println();

        System.out.println("Number of times compounded a year? ");
        double n = numbers.nextDouble();
        System.out.println();

        System.out.println("Number of days at interest? ");
        double t = numbers.nextDouble();
        System.out.println();

        double exponent = n*t / 365;


        double a = p * (1+Math.pow((0.01*r/n), exponent));

        System.out.printf("Test %.2f\n", a);



        //5000 11.5 365 900
    }
}
