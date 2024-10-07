package Q1;

public class prog122d {
    public static void main(String[] args) {
        int lcv = -12;
        while (lcv < 16){
            lcv += 1;
            double y = Math.pow(lcv, 6) - (3 * Math.pow(lcv, 5)) - (93 * Math.pow(lcv, 4)) + (87 * Math.pow(lcv, 3)) - (1380 * Math.pow(lcv, 1)) - 2800;
            System.out.println(lcv + "\t\t" + y);
        }
    }
}
