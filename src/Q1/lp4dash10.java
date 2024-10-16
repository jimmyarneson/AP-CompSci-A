package Q1;
import java.util.Scanner;

public class lp4dash10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Rectangular Prism");

        System.out.print("Enter length: ");
        int length = input.nextInt();
        System.out.println();

        System.out.print("Enter width: ");
        int width = input.nextInt();
        System.out.println();

        System.out.print("Enter height: ");
        int height = input.nextInt();
        System.out.println();

        int rect = length * width * height;
        System.out.println("The volume is: " + rect);

        System.out.println("Sphere");

        System.out.print("Enter the radius: ");
        double radius = input.nextDouble();
        System.out.println();

        double d = 2*radius;
        double volume = 3.14 * d * d * d / 6;
        System.out.printf("The volume of the sphere is: " + volume);
        System.out.println();

        System.out.print("Enter length for all four sides: ");
        int length2 = input.nextInt();
        System.out.println();

        System.out.println("Cube");


        double volume2 = Math.pow(length2, 3);

        System.out.println("The volume is: "+ volume2);
    }
}
/*
 Rectangular Prism
Enter length: 3

Enter width: 4

Enter height: 5

The volume is: 60
Sphere
Enter the radius: 3

The volume of the sphere is: 113.04
Enter length for all four sides: 4

Cube
The volume is: 64.0
 */