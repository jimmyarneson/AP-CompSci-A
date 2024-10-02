package Q1;

public class lang122c {
    public static void main(String[] args) {

        int lcv = 0;

        while (lcv < 10) {
            lcv += 2.0;
            int lcv2 = 0;
            lcv2 += lcv +1.0;
            int lcv3 = 0;
            lcv3 += lcv * 2;
            int lcv4 = 0;
            lcv4 += Math.pow(lcv,2);

            System.out.println(lcv + "\t\t" + lcv2 + "\t\t" + lcv3 + "\t\t" + lcv4);

        }
    }
}
/*
2		3		4		4
4		5		8		16
6		7		12		36
8		9		16		64
10		11		20		100
 */