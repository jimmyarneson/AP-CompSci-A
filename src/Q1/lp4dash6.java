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
        int range2 = max2 - min2 + 1;
        int opperator = 0;
        String opp = " ";
        for (int i = 0; i < 4; i++) {
            opperator = (int)(Math.random() * range2) + min2;
        }
        if (opperator == 1){
            opp =("*");
        } else if (opperator == 2) {
            opp = ("+");
        } else if (opperator == 3) {
            opp = ("-");
        } else if (opperator == 4) {
            opp = ("/");
        }
        System.out.println("What is " +num1 + " " + opp + " " + num2 + "?");
        double answer = 0;
        if (opperator == 1){
            answer = num1 + num2;
        }else if (opperator == 2) {
            answer = num1 * num2;
        } else if (opperator == 3) {
            answer = num1 - num2;
        } else {
            answer = num1 / num2;
        }
        int Inpanswer = input.nextInt();

        if (Inpanswer == answer) {
            System.out.println("Correct");
        } else {
            System.out.println("Incorrect");
        }


    }
}
/*
What is 2 - 4?
-2
Correct
 */