package Q1;
import java.util.Locale;
import java.util.Scanner;

public class MSOE20141 {
    public static void main(String[] args) {
        Scanner kbd = new Scanner(System.in);
        System.out.print("Enter a word: ");
        String word = kbd.nextLine();
        word = word.toLowerCase();
        int dblcnt = 0;

        for (int lcv = 0; lcv < word.length() - 1; lcv++) {
            String cletter = word.substring(lcv, lcv+1); // word[lcv]
            String nLetter = word.substring(lcv+1, lcv+2); // world[lcv+1]
            if (cletter.equals(nLetter))
                dblcnt++;
        }
        System.out.printf("%s contains %d double letters\n", word, dblcnt);
    }
}
/*
Enter a word: coolbeens
coolbeens contains 2 double letters
 */