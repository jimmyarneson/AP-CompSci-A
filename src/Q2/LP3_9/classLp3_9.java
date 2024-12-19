package Q2.LP3_9;

public class classLp3_9 {
    private int myBirthyear;
    private int myBirthmonth;
    private int myBirthday;
    private int myCurrentyear;
    private int myCurrentmonth;
    private int myCurrentday;
    private double myTimealive;
    private double myHoursslept;

    public classLp3_9(int by, int bm, int bd, int cy, int cm, int cd) {
        myBirthyear = by;
        myBirthmonth = bm;
        myBirthday = bd;
        myCurrentyear = cy;
        myCurrentmonth = cm;
        myCurrentday = cd;
        myTimealive = 0.0;
        myHoursslept = 0.0;
    }

    public void calculation() {
        myTimealive = Math.abs(myBirthyear - myCurrentyear) * 365 + Math.abs(myBirthmonth - myCurrentmonth) * 30 + Math.abs(myBirthday);
        myHoursslept = Math.abs(myTimealive/2) * 8;
    }

    public String toString() {return myBirthyear + "\t\t" + myBirthmonth + "\t\t" + myBirthday + "\t\t" +
    myCurrentyear + "\t\t" + myCurrentmonth + "\t\t" + myCurrentday + "\t\t" + myTimealive + "\t\t" + myHoursslept; }
}
