package Q2.prog402a;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class prog402a {
    public static void main(String[] args) {
        try {
            Scanner file = new Scanner(new File("Langdat/prg402a.dat"));
            Cl402a[] list = new Cl402a[1000];
            int count = 0;
            double mean = 0.0;

            double asc = 0.0;
            int[] alsc = new int[100];
            while (file.hasNext()){

            }

        } catch (IOException e){
            System.out.println("Error: " + e);
        }
    }
}
