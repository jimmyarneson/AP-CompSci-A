package Q1.Prog52aCl;

public class Cl52a { // rectangle (helper class)
    private int myLen;
    private int myWid;
    private int myArea;
    private int myPerim;

    // Input section (constructor)
    public Cl52a(int len, int wid) {
        // Set up private data
        myLen = len;
        myWid = wid;
        myArea = 0;
        myPerim =0;
    }

    // Calculation Section (Mutators/Setters)
    public void calc() {
        myArea = myLen * myWid;
        myPerim = 2 * myLen + 2 * myWid;
    }

    // Output section (Accessors/getters)
    public int getArea() {return myArea; }
    public int getPerim() { return myPerim;}

    // Class methods: "public <return_type> <name>(<args>) {...}"
}
