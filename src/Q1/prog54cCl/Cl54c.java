package Q1.prog54cCl;

import java.util.PrimitiveIterator;

public class Cl54c {
    private double myRad;
    private double myArea;
    private double myCirc;
    private double myPi;

    public Cl54c(double rad, double area, double circ, double PI) {
        myRad = rad;
        myArea = area;
        myCirc = circ;
        myPi = PI;
    }

    public void calc() {
        myArea = myPi * myRad * myRad;
        myCirc = 2.0 * myPi * myRad;
    }

    public double getArea() {return myArea;}
    public double getCirc() {return myCirc;}
}
