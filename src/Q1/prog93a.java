package Q1;
import javax.swing.plaf.synth.SynthToolTipUI;
import java.sql.SQLOutput;
import java.util.*;

public class prog93a {
    public static void main(String[] args) {
        Scanner kwhu = new Scanner(System.in);

        System.out.println("Enetr KWH used: ");
        double kwh = kwhu.nextDouble();

        double baserate = (kwh) * 0.0475;

        double surcharge = baserate * 0.10;

        double citytax = baserate * 0.030;

        double latefee = baserate * 0.040;

        double pay = baserate + surcharge + citytax + 0.01;

        double payl = pay + latefee + 0.25;

        System.out.printf("Baserate: %.2f\n", baserate);
        System.out.println();

        System.out.printf("Surcharge: %.2f\n", surcharge);
        System.out.println();

        System.out.printf("City Tax: %.2f\n", citytax);
        System.out.println();

        //System.out.printf("Late fee: %.2f\n", latefee);
        //System.out.println();

        System.out.printf("Pay this ammount: %.2f\n", pay);
        System.out.println();

        System.out.printf("After May 20th pay: %.2f\n", payl);
        System.out.println();
    }
}

/*
Enetr KWH used:
993
Baserate: 47.17

Surcharge: 4.72

City Tax: 1.42

Pay this ammount: 53.31

After May 20th pay: 55.45
 */