package Q1;
import com.sun.source.util.SourcePositions;

import java.util.*;

public class lp4dash6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int max = 10;
        int min = 1;
        int range = max - min + 1;
        int num1 = 0;
        int num2 = 0;
        for (int i = 0; i < 20; i++) {
            num1 = (int)(Math.random() * range) + min;
        }
        for (int i = 0; i < 20; i++) {
            num2 = (int)(Math.random() * range) + min;
        }
        int max2 = 4;
        int min2 = 1;
        int opperator = 0;
        for (int i = 0; i < 4; i++) {
            opperator = (int)(Math.random() * range) + min;
        }
        if (opperator == 1){
            System.out.print("*");
        } else if (opperator == 2) {
            System.out.print("+");
        } else if (opperator == 3) {
            minus = ("-");
        } else if (opperator == 4) {
            System.out.print("/");
        }
        System.out.println("What is " +num1 + " " + opperator + " " + num2);
    }
}
