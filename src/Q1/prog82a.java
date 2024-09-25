package Q1;
import java.util.Scanner;

public class prog82a {
    public static void main(String[] args) {
        Scanner speeds = new Scanner(System.in);
        System.out.print("Enter the speed limit: ");
        int speedlimit = speeds.nextInt();

        System.out.print("Enter the vehicle speed: ");
        int speedgoing = speeds.nextInt();

        int ticket = 20;
        int speedover = speedgoing - speedlimit;
        int fine = ticket + (speedover * 5);

        System.out.printf("Fine-----------------------$"+ fine);

    }
}
/*
Enter the speed limit: 30
Enter the vehicle speed: 42
Fine-----------------------$80
 */