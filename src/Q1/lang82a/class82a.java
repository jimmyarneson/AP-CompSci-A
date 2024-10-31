package Q1.lang82a;

public class class82a {
    private int myspeedlimit;
    private int myspeedgoing;
    private int myfine;

    public cl82a (int spl, int spg, int fine) {
        myspeedlimit = 0;
        myspeedgoing = 0;
        myfine = 0;
    }

    public void calc(){
        myfine = 20 + ((myspeedgoing - myspeedlimit) * 5);
    }
    public int getFine() {return myfine;}
}
