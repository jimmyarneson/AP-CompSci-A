package Q2.LP3_9;
import java.util.*;

public class lp3_9 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your birth year: ");
        int by = input.nextInt();
        System.out.println("Enter your birth month: ");
        int bm = input.nextInt();
        System.out.println("Enter your birth day: ");
        int bd = input.nextInt();
        System.out.println("Enter your current year: ");
        int cy = input.nextInt();
        System.out.println("Enter your current month: ");
        int cm = input.nextInt();
        System.out.println("Enter your current day: ");
        int cd = input.nextInt();


        classLp3_9 apexlegends = new classLp3_9(by, bm, bd, cy, cm, cd);
    }

}
