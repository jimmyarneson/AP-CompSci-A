package Q1;

import java.util.Scanner;

public class prog58b {
    public static void main(String[] args){
        Scanner root = new Scanner(System.in);

        System.out.print("Enter A");
        double numA = root.nextDouble();
        System.out.println();

        System.out.print("Enter B");
        double numB = root.nextDouble();
        System.out.println();

        System.out.print("Enter C");
        double numC = root.nextDouble();
        System.out.println();

        //double numAa = Math.pow(numA, 2);
        //double numBb = numB * numB;

        double positive = (-numB + Math.sqrt(Math.pow(numB, 2.0) -4.0 * (numA * numC))) / (2 * numA);
        double negative = (-numB - Math.sqrt(Math.pow(numB, 2.0) -4.0 * (numA * numC))) / (2 * numA);

        System.out.printf("The positive root is: %.0f\n", positive);
        System.out.println();

        System.out.printf("The negative root is: %.0f\n", negative);
        System.out.println();
    }

}
/*
Enter A 1

Enter B 1

Enter C -2

The positive root is: 1

The negative root is: -2
 */