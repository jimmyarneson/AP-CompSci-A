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
                int id = file.nextInt();
                int scores = file.nextInt();

                if(id != -999) {
                    Cl402a rustgamer = new Cl402a(id, scores);
                    list[count] = rustgamer;
                    alsc[count] = scores;
                    count++;
                }
                asc += scores;
                 mean = asc/count;
            }

            System.out.println("ID\tScore\tDifference");
                for (int i = 0; i < count; i++) {
                    double difference = Math.round((alsc[i] - mean) * 100.0) / 100.0;
                    System.out.println(list[i] + "\t\t" + difference);
                }
                System.out.println("Average score = " + mean);

        } catch (IOException e){
            System.out.println("Error: " + e);
        }
    }
}
/*
ID	Score	Difference
115		257		14.38
123		253		10.38
116		246		3.38
113		243		0.38
112		239		-3.62
104		239		-3.62
110		238		-4.62
218		243		0.38
208		242		-0.62
222		223		-19.62
223		230		-12.62
213		229		-13.62
207		228		-14.62
203		224		-18.62
305		265		22.38
306		262		19.38
311		256		13.38
325		246		3.38
321		245		2.38
323		245		2.38
301		242		-0.62
Average score = 242.61904761904762
 */