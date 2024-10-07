package Q1.Prog52aCl;
import java.util.Scanner;

public class prog52Cl {
    public static void main(String[] args) {
        // Input
        Scanner input = new Scanner(System.in);
        System.out.print("Enter length: ");
        int l = input.nextInt();
        System.out.print("Enter width: ");
        int w = input.nextInt();

        // Calculation Section
        Cl52a wow = new Cl52a(l, w); // new object of "Cl52a" class
        wow.calc(); //Dont forget to call calc() or setThing()!
        int area = wow.getArea();
        int perim = wow.getPerim();

        // Output section
        System.out.println("Rectange area = " + area);
        System.out.println("Rectange perim = " + perim);
    }
}
