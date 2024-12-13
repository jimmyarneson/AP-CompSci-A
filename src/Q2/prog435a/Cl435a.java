package Q2.prog435a;

public class Cl435a {
    private int myCt;
    private int myG;
    private double myC;
    private double[] gnum = new double[8];
    private double[] cnum = new double[6];
    private String[] ct = new String[6];

    public Cl435a(int Ct, int G){
        myCt = Ct;
        myG = G;
        myC = 0.0;
        gnum[0] = 1.35;
        gnum[1] = 2.00;
        gnum[2] = 2.50;
        gnum[3] = 3.25;
        gnum[4] = 4.10;
        gnum[5] = 4.8;
        gnum[6] = 5.50;
        gnum[7] = 6.00;

        cnum[0] = 1.0;
        cnum[1] = 1.3;
        cnum[2] = 1.6;
        cnum[3] = 2.0;
        cnum[4] = 2.4;
        cnum[5] = 2.7;

        ct[0] = "Compact Car";
        ct[1] = "Small Car";
        ct[2] = "Mid Size Car";
        ct[3] = "Full Size Car";
        ct[4] = "Truck";
        ct[5] = "16 Wheeler";
    }

    public void calc() {
        myC = gnum[myG - 1] * cnum[myCt - 1];
    }

    public String toString() {
        return ct[myCt - 1] + "\t$" + cnum[myCt - 1] + "\t$" + gnum[myG - 1] + "\t$" + myC;
    }
    
}
