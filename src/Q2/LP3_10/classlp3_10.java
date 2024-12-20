package Q2.LP3_10;

public class classlp3_10 {
    private int myBurgers;
    private int myFries;
    private int mySodas;
    private double Totbefore;
    private double Tax;
    private double Total;

    public classlp3_10(int burgers, int fries, int sodas){
        myBurgers = burgers;
        myFries = fries;
        mySodas = sodas;
        Totbefore = 0.0;
        Tax = 0.0;
        Total = 0.0;
    }

    public void calc() {
        Totbefore = myBurgers * 1.69 + myFries * 1.09 + mySodas * 0.99;
        Tax = Math.round((Total * 0.065) * 100.0) / 100.0;
        Total = Totbefore + Tax;
    }
    public double getTotal() {return Total;}
    public String toString() {
        return "Total before tax: " + Totbefore + "\nTax: " + Tax + "\nFinal total: " + Total;
    }
}
