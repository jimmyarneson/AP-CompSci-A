package Q1;
import java.util.Scanner;

public class lp5dash9 {
    public static void main(String[] args) {

        System.out.println("x^1\t\tx^2\t\tx^3\t\tx^4\t\tx^5");

        int lcv = 0;
        while(lcv < 6) {
            lcv += 1;
            double lcv2 = Math.pow(lcv, 2);
            double lcv3 = Math.pow(lcv, 3);
            double lcv4 = Math.pow(lcv, 4);
            double lcv5 = Math.pow(lcv, 5);
            System.out.println(lcv + "\t\t" + lcv2 + "\t\t" +  lcv3 + "\t\t" + lcv4 + "\t\t" + lcv5);
        }
    };
}
/*
x^1		x^2		x^3		x^4		x^5
1		1.0		1.0		1.0		1.0
2		4.0		8.0		16.0	32.0
3		9.0		27.0	81.0	243.0
4		16.0	64.0	256.0	1024.0
5		25.0	125.0	625.0	3125.0
6		36.0	216.0	1296.0	7776.0
 */