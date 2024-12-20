package Q2.LP3_14;

public class classLp3_14 {
    private int myAny;
    private int myMny;
    private int myAnj;
    private int myMnj;
    private int myAcn;
    private int myMcn;
    private double anTot;
    private int marTot;
    private double peran;
    private double peram;
    private double tot;

    public classLp3_14(int any, int mny, int anj, int mnj, int acn, int mcn) {
        myAny = any;
        myMny = mny;
        myAnj = anj;
        myMnj = mnj;
        myAcn = acn;
        myMcn = mcn;
        anTot = myAny + myAnj + myAcn;
        marTot = myMny + myMnj + myMcn;
        peran = 0.0;
        peram = 0.0;
        tot = anTot + marTot;
    }

    public void calculator() {
        peran = (Math.round(anTot/tot * 100.0*100)/100.00);
        peram = (Math.round(marTot/tot * 100*100)/100.00);
    }

    public String toString(){
        return "Canidates\t\t Votes Percentage" +
                "\nAwbrey \t\t" + anTot + "\t" + peran + " %" +
                "\nMartinez\t\t" + marTot + "\t" + peram + " %" +
                "\nTotal Votes:\t " + tot;
    }
}
