package Q1;

import java.util.Scanner;

public class prog54c {
    public static void main(String[] args) {
        Scanner rad = new Scanner(System.in);

        System.out.print("Enter the radius: ");
        double radius = rad.nextDouble();
        System.out.println();

        final double pi = 3.14159;
        int radSquared = (int)Math.pow(radius, 2);
        double area = pi * radSquared;
        double circumfrence = 2 * pi * radius;

        System.out.print("Radius: " + radius);
        System.out.println();

        System.out.printf("Area: = %.3f \n", + area);
        System.out.println();

        System.out.printf("Circumfrence: = %.3f \n", + circumfrence);




    }
}
/*
Radius: 3.172
Area: = 31.416

Circumfrence: = 19.930

 */