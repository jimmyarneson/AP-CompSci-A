package Q1.prog76aCl;

public class Cl76a {
    private int myDis;
    private int mySup;

    public Cl76a(int dis, int sup) {
        myDis = dis;
        mySup = sup;
    }

    public void calc() {
        mySup = (myDis * 9) *12345679;
    }

    public int getSup() {
        return mySup;
    }
}
