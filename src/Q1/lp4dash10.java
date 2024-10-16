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

        System.out.print("Enter the radius");
        double radius = input.nextDouble();
        System.out.println();

        double volume = 3.14
    }
}
