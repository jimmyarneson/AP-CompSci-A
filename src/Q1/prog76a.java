package Q1;
import java.util.*;

public class prog76a {
    public static void main(String[] args) {
        Scanner number = new Scanner(System.in);

        System.out.println("Enter a number you dislike: ");
        int step1 = number.nextInt();

        int step2 = step1 * 9 * 12345679;

        System.out.printf("Number:" + step2);
    }
}
/*
Enter a number you dislike:
5
Number:555555555
 */