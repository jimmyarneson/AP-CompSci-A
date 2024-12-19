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
        apexlegends.calculation();
        classLp3_9[] minecraft = new classLp3_9[1];
        minecraft[0] = apexlegends;
        System.out.println("Birth year\tBirth month\tBirth day\tCurrent year\tCurrent month" +
                "\tCurrent day\tDays alive\tHours slept");
        System.out.println("\n" + minecraft[0]);
    }

}
/*
Enter your birth year:
2008
Enter your birth month:
10
Enter your birth day:
29
Enter your current year:
2024
Enter your current month:
12
Enter your current day:
19
Birth year	Birth month	Birth day	Current year	Current month	Current day	Days alive	Hours slept

2008		10		29		2024		12		19		5929.0		23716.0
 */