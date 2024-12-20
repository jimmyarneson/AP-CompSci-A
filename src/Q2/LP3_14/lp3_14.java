package Q2.LP3_14;
import java.util.*;

public class lp3_14 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter results for New York: ");
        System.out.print("Aubrey: ");
        int any = input.nextInt();
        System.out.print("Martinez: ");
        int mny = input.nextInt();
        System.out.println("Enter results for New Jersey: ");
        System.out.print("Aubrey: ");
        int anj = input.nextInt();
        System.out.print("Martinez: ");
        int mnj = input.nextInt();
        System.out.println("Enter results for Connecticut: ");
        System.out.print("Aubrey: ");
        int acn = input.nextInt();
        System.out.print("Martinez: ");
        int mcn = input.nextInt();
        classLp3_14 santaclause = new classLp3_14(any, mny, anj, mnj, acn, mcn);
        santaclause.calculator();
        classLp3_14[] fortnite = new classLp3_14[1];
        fortnite[0] = santaclause;
        System.out.print("\n" + fortnite[0]);
    }
}
/*
Enter results for New York:
Aubrey: 314159
Martinez: 271680
Enter results for New Jersey:
Aubrey: 89008
Martinez: 121032
Enter results for Connecticut:
Aubrey: 213451
Martinez: 231034

Canidates		 Votes Percentage
Awbrey 		616618.0	49.71 %
Martinez		623746	50.29 %
Total Votes:	 1240364.0
 */