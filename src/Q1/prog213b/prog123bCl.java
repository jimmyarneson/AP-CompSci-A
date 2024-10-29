package Q1.prog213b;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class prog123bCl {
        public static void main(String[] args) {
            try {
                Scanner file = new Scanner(new File("Langdat/prog213b.txt"));

                while (file.hasNext()){
                    int qnt = file.nextInt();
                    Class213b wowza = new Class213b(qnt);
                    wowza.calc();
                    System.out.println(wowza);
                }

            } catch (IOException e){
                System.out.println("Error: " + e);
            }
        }
    }

/*
Quanity: true	Price: &5.95	Amount Due: $89.25
Quanity: true	Price: &5.95	Amount Due: $267.75
Quanity: true	Price: &5.95	Amount Due: $327.25
Quanity: true	Price: &5.95	Amount Due: $333.20
Quanity: true	Price: &5.95	Amount Due: $249.90
Quanity: true	Price: &5.75	Amount Due: $661.25
Quanity: true	Price: &5.95	Amount Due: $547.40
Quanity: true	Price: &5.95	Amount Due: $184.45
Quanity: true	Price: &5.95	Amount Due: $446.25
Quanity: true	Price: &5.95	Amount Due: $285.60
Quanity: true	Price: &5.95	Amount Due: $345.10
Quanity: true	Price: &5.95	Amount Due: $5.95
Quanity: true	Price: &5.95	Amount Due: $148.75
Quanity: true	Price: &5.95	Amount Due: $95.20
Quanity: true	Price: &5.95	Amount Due: $113.05
 */