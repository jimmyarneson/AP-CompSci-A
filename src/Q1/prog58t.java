package Q1;
import java.util.*;

public class prog58t {
    public static void main(String[] args){
        Scanner money = new Scanner(System.in);

        System.out.println("Enter purchase price: ");
        double purchaseprice = money.nextDouble();
        //System.out.println();

        System.out.println("Enter amount given: ");
        double amountgiven = money.nextDouble();
        //System.out.println();

        //MONEY
        double dollar = 1.00;
        double quarter = 0.25;
        double dime = 0.10;
        double nikel = 0.05;
        double penny = 0.01;
        //MONEY

        double changedue = amountgiven - purchaseprice;
        double dollarsdue = Math.floor(changedue);
        double quartersdue = Math.floor(changedue / quarter);

        System.out.println("Purchase ammount = " + purchaseprice);
        System.out.println("Amount given = " + amountgiven);
        System.out.printf("Change due = %.2f\n", changedue);

        System.out.printf("Dollars: %.0f\n", dollarsdue);
        System.out.printf("Quarters: %.0f\n", quartersdue);
    }
}
