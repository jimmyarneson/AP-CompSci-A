package Q1.prog213b;

public class Class213b {
    private int myQuanity;
    private double myPrice;
    private double myAmtDue;

    public Class213b(int quaninty) {
        myQuanity = quaninty;
        myPrice = 0;
        myAmtDue = 0;
    }
    public void calc() {
        if (myQuanity >= 0 && myQuanity <= 99)                  myPrice = 5.95;
        else if (myQuanity > 99 && myQuanity <= 199)            myPrice = 5.75;
        else if (myQuanity > 199 && myQuanity <= 299)           myPrice = 5.40;
        else if (myQuanity > 299)                               myPrice = 5.15;
        myAmtDue = myPrice * myQuanity;
    }

    public String toString() {
        return String.format("Quanity: %b\tPrice: &%.2f\tAmount Due: $%.2f", myQuanity , myPrice
                , myAmtDue);
    }


}
