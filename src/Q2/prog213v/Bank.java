package Q2.prog213v;

public class Bank {
    private double myAmount;

    public Bank(double amount) {myAmount = amount; }
    public double getAmount() {return myAmount; }

    public void calc(Transaction thing) {
        if (thing.getCode().equals("D"))
            myAmount += thing.getAmount();
        else if (thing.getCode().equals("S"))
            myAmount -= thing.getAmount();
        else if (thing.getCode().equals("C")) {
            if (myAmount < thing.getAmount())
                myAmount -= 10;
            else
                myAmount -= thing.getAmount();
        }
    }
}
