package Q1;
import java.util.Scanner;
public class lp4dash2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the package weight in kilograms: ");
        int weight = input.nextInt();
        System.out.println();

        System.out.print("Enter the length in centimeters: ");
        int length = input.nextInt();
        System.out.println();

        System.out.print("Enter the package width in centimeters: ");
        int width = input.nextInt();
        System.out.println();

        System.out.print("Enter the package height in centimeters: ");
        int height = input.nextInt();
        System.out.println();

        double total = length * width * height;

        if (weight > 27) {
            System.out.print("The package is too heavy");
        } else if (total > 100000){
            System.out.print("The package is too large");
        } else
            System.out.print("The package is too large and too heavy");
    }
}
/*
Enter the package weight in kilograms: 32

Enter the length in centimeters: 10

Enter the package width in centimeters: 25

Enter the package height in centimeters: 38
 */