package Q1.lang82a;
import Q1.lang88a.Class82a;

import java.util.Scanner;

public class prog82acl {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the speed limit: ");
        int spl = input.nextInt();
        System.out.print("Enter the vehicle speed: ");
        int vsp = input.nextInt();

        Class82a wow = new class82a(spl, vsp);


    }
}
