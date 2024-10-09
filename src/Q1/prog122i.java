package Q1;

public class prog122i {
    public static void main(String[] args) {
        int lcv = -26;
        while (lcv < 25) {
            lcv += 1.0;
            double lcv2 = Math.pow(lcv, 0.3333333);
            System.out.printf("%d\t\t %.5f\t\t \n", lcv, lcv2);
        }
    }
}
