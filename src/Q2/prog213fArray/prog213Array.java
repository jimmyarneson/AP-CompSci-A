package Q2.prog213fArray;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class prog213Array {
    public static void main(String[] args) {
        try {
            Scanner file = new Scanner(new File("Langdat/prog213f.dat"));

            cl213f[] list = new cl213f[1000];
            int cnt = 0;

            while (file.hasNext()) {
                int kwh = file.nextInt();

                if (kwh != -999) {
                    cl213f yikes = new cl213f(kwh);
                    list[cnt] = yikes;
                    cnt++;
                }
            }

            for (int lcv = 0; lcv < cnt; lcv++) {
                list[lcv].calc();
                System.out.println(list[lcv]);  // list[lcv].toString()
            }
        } catch (IOException e) {
            System.out.println("Error: " + e);
        }
    }
}
