package Q1.lang82a;

public class Cl82a {
    private int myspeedlimit;
    private int myspeedgoing;
    private int myfine;

    public Cl82a(int sl, int sg) {
        myspeedlimit = speedlimit;
        myspeedgoing = speedgoing;
        myfine = 0;
    }

    public void calc() {
        int ticket = 20;
        int speedover = speedgoing - speedlimit;
        fine = (speedover * 5);
    }

    public int getFine() {return fine;}

}
