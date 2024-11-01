package Q1.prog54bCl;

public class Cl54bCl {
    private int myNum1;
    private int myNum2;
    private int myNum3;
    private int myNum4;
    private int mySum;
    private double myAvg;

    public Cl54bCl(int num1, int num2, int num3, int num4, int sum, double avg) {
        myNum1 = num1;
        myNum2 = num2;
        myNum3 = num3;
        myNum4 = num4;
        mySum = sum;
        myAvg = avg;
    }

    public void calc() {
        mySum = myNum1 + myNum1 + myNum3 + myNum4;
        myAvg = mySum / 4.0;
    }

    public int getSum() {return mySum;}
    public double getAvg() {return myAvg;}
}
