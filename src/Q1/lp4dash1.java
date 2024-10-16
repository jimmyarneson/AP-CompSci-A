package Q1;
import java.util.Scanner;

public class lp4dash1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter amount of copies to be printed: ");
        int coppies = input.nextInt();
        double cost = 0.0;

        if (coppies > 0 && coppies < 99) {
            cost = 0.30;
        } else if (coppies > 100 && coppies < 499) {
            cost = 0.28;
        } else if (coppies > 500 && coppies < 749) {
            cost = 0.27;
        } else if (coppies > 750 && coppies < 1000) {
            cost = 0.26;
        } else if (coppies > 1000) {
            cost = 0.25;
        }
        double totalcost = coppies * cost;
        System.out.println("Price per copy is: " + cost);
        System.out.println("Total cost is: " + totalcost);
    }
}
/*
Enter amount of copies to be printed: 1001
Price per copy is: 0.25
Total cost is: 250.25
 */