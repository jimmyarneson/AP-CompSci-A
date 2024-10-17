package Q1;
import java.util.*;
import java.util.Scanner;

public class lp4dash16 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a triangle in degrees: ");
        double degrees = input.nextDouble();
        System.out.println();

        double radian = Math.toRadians(degrees);
        double sine = Math.sin(radian);
        double cosine = Math.cos(radian);
        double tangent = Math.tan(radian);

        System.out.printf("Sine: %.3f \n", + sine);
        System.out.println();
        System.out.printf("Cosine: %.3f \n", + cosine);
        System.out.println();
        System.out.printf("Tangent: %.3f \n", +tangent);
    }
}
/*
Enter a triangle in degrees: 30

Sine: 0.500

Cosine: 0.866

Tangent: 0.577
 */