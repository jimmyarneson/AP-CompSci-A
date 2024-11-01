package Q1.prog76aCl;
import java.util.Scanner;

public class prog76aCl {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number you dislike: ");
        int dis = input.nextInt();
        int sup = 0;

        Cl76a zing = new Cl76a(dis, sup);
        zing.calc();
        sup = zing.getSup();

        System.out.print(sup +" Suprprise!");
    }
}
/*
Enter a number you dislike: 5
555555555 Suprprise!
 */