package Q1;
import java.util.*;

public class prog54a {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        // int, double, boolean, String
        System.out.print("Enter the car model: ");
        String model = keyboard.nextLine();

        System.out.print("Enter miles driven: ");
        int miles = keyboard.nextInt();

        System.out.print("Enter gallons used: ");
        int gallons = keyboard.nextInt();

        double mpg = miles / (double)gallons;
        System.out.println("Mpg used by " + model + " is " +mpg+ "m/g");
    }
}
/*
Enter the car model: 1974 VW Bug
Enter miles driven: 286
Enter gallons used: 9
Mpg used by 1974 VW Bug is 31.77777777777778m/g
 */