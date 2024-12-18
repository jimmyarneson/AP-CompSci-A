package Q2.LP3_9;

public class classLp3_9 {
    private int myBirthyear;
    private int myBirthmonth;
    private int myBirthday;
    private int myCurrentyear;
    private int myCurrentmonth;
    private int myCurrentday;
    private int myTimealive;
    private int myHoursslept;

    public classLp3_9(int by, int bm, int bd, int cy, int cm, int cd, double ta, double hs) {
        myBirthyear = by;
        myBirthmonth = bm;
        myBirthday = bd;
        myCurrentyear = cy;
        myCurrentmonth = cm;
        myCurrentday = cd;
        ta = 0.0;
        hs = 0.0;
    }

    public void calculation() {
        myTimealive = Math.abs(myBirthyear - myCurrentyear) * 365 + Math.abs(myBirthmonth - myCurrentmonth) * 30 + Math.abs(myBirthday);
        myHoursslept = Math.abs(myTimealive/2) * 8;
    }

    public String toString() {return myBirthyear + "\t\t" + myBirthmonth + "\t\t" + myBirthday + "\t\t" +
    myCurrentyear + "\t\t" + myCurrentmonth + "\t\t" + myCurrentday + "\t\t" + myTimealive + "\t\t" + myHoursslept; }
}
