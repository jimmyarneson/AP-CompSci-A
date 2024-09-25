package Q1;
import java.sql.SQLOutput;
import java.util.Scanner;

public class prog72t {
    public static void main(String[] args) {
        Scanner time = new Scanner(System.in);

        System.out.print("Enter time 1: ");
        int time1 = time.nextInt();
        System.out.print("Enter time 2: ");
        int time2 = time.nextInt();

        int hourspast = time2 - time1;

        System.out.println("Hours Past: " + hourspast);

    }
}
/*
 Enter time 1: 900
 Enter time 2: 1730
 Hours Past: 830
 */