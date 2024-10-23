package Q1;
import java.util.Scanner;

public class lp5_17 {
    public static void main(String[] args) {
        String string = "fortnite67";
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the password: ");
        String guess1 = input.next();

        if(string.equals(guess1)){
            System.out.print("Correct");
        } else{
            System.out.print("Incorect");
            System.out.println();
            System.out.print("Enter the password: ");
            String guess2 = input.next();
            if(guess2.equals(string)){
                System.out.print("Correct");
            } else{
                System.out.print("Incorect");
                System.out.println();
                System.out.print("Enter the password: ");
                String guess3 = input.next();
                if (guess3.equals(string)) {
                    System.out.print("Correct");
                } else {
                    System.out.print("Incorrect");
                    System.out.println();
                    System.out.print("Too many trys!");
                }
            }
        }
    }
}
/*
Enter the password: fortnite76
Incorect
Enter the password: fornite87
Incorect
Enter the password: JimmyIsCoolReal
Incorrect
Too many trys!
 */