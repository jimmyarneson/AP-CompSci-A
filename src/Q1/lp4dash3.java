package Q1;
import java.util.Scanner;

public class lp4dash3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("How many eggs are you purchasing: ");
        double eggs = input.nextInt();
        double dozen = 12.0 / Math.floor(eggs);
        double remainer = eggs % 12;
        double price = 0.0;

        if (0 < dozen && dozen <= 4) {
            price = 0.50;
        } else if (4 < dozen && dozen <= 6) {
            price = 0.45;
        } else if (6 < dozen && dozen <= 11) {
            price = 0.40;
        } else if (dozen > 11) {
            price = 0.35;
        }
        double total = (dozen * eggs) / (remainer / price) / 2 + 0.25;
        System.out.printf("Total Cost: $%.2f" ,total );

    }
}
/*
How many eggs are you purchasing: 18
Total Cost: $0.75
 */