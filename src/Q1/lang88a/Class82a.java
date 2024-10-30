package Q1.lang88a;

public class Class82a {
    private int myNum1;
    private int myNum2;
    private int mysum;
    private int mydiff;
    private double myprod;
    private double myavg;
    private int myabsv;
    private int mymax;
    private int mymin;

    public Class82a(int num1, int num2) {
        myNum1 = num1;
        myNum2 = num2;
        mysum = 0;
        mydiff = 0;
        myprod = 0;
        myavg = 0;
        myabsv = 0;
        mymax = 0;
        mymin = 0;
    }

    public void calc() {
        mysum = myNum1 + myNum2;
        mydiff = myNum1 - myNum2;
        myprod = myNum1 / myNum2;
        myavg = mysum / 2;
        myabsv = Math.abs(mysum);
    }
}
