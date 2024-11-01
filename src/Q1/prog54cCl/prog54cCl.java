package Q1.prog54cCl;
import java.util.Scanner;

public class prog54cCl {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the radius: ");
        double rad = input.nextDouble();
        double c = 0;
        double a = 0;
        double p = Math.PI;

        Cl54c bazinga = new Cl54c(rad, c, a, p);
        bazinga.calc();
        double area = bazinga.getArea();
        double circ = bazinga.getCirc();

        System.out.printf("The radius of the circle is: %.3f", rad);
        System.out.println();
        System.out.printf("The area of the circle is: %.3f", area);
        System.out.println();
        System.out.printf("The circufrence of the circle is: %.3f", circ);
    }
}
/*
Enter the radius: 3.172
The radius of the circle is: 3.172
The area of the circle is: 31.609
The circufrence of the circle is: 19.930
 */