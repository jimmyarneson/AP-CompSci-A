package Q1.lang82a;

public class Cl82a {
    private int myLim;
    private int mySpe;
    private int myFine;

    public Cl82a(int lim, int spe, int fine) {
        myLim = lim;
        mySpe = spe;
        myFine = fine;
    }

    public void calc() {
        myFine = 20 + ((mySpe - myLim)*5);
    }

    public int getFine() {return myFine;}

}
