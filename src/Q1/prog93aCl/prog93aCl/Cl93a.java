package Q1.prog93aCl.prog93aCl;

public class Cl93a {
    private int kwh;
    private double baserate;
    private double surcharge;
    private double citytax;
    private double total;
    private double latetotal;


    public Cl93a(int kwh) {
        this.kwh = kwh;
        baserate = 0;
        surcharge = 0;
        citytax = 0;
        total = 0;
        latetotal = 0;
    }

    public void calc() {} //TODO

    public String tostring() {
        return "KWH Used: " + kwh + "Base Rate: " + baserate
                + "Surcharge: " + surcharge + "City Tax: " + citytax
                + "Total: " + total + "Late total: " + latetotal;
    }
}
