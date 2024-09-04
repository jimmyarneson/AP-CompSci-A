package Q1;
import java.util.*;

public class prog54b {
    public static void main(String[]args) {
        Scanner numbers = new Scanner(System.in);

        System.out.print("Enter a 3 digit number: ");
        int num1 = numbers.nextInt();
        System.out.println();

        System.out.print("Enter a 3 digit number: ");
        int num2 = numbers.nextInt();
        System.out.println();

        System.out.print("Enter a 3 digit number: ");
        int num3 = numbers.nextInt();
        System.out.println();

        System.out.print("Enter a 3 digit number: ");
        int num4 = numbers.nextInt();
        System.out.println();

        int total = num1 + num2 + num3 + num4;

        System.out.print("Total =" + total);
        System.out.println();

        double avg = total / 4;

        System.out.print("Average = " + avg);
    }
}

/*
Enter a 3 digit number: 475

Enter a 3 digit number: 821

Enter a 3 digit number: 369

Enter a 3 digit number: 562

Total =2227
Average = 556.0
 */