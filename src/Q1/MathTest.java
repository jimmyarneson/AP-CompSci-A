package Q1;

public class MathTest {
    public static void main(String[] args) {
        int twocubed = (int)Math.pow(2, 3); // 2^3

        int num1 = 5;
        int num2 = 7;
        int num3 = 6;
        int sum = num1 + num2 + num3;
        sum /= 3; // sum = sum / 3;

        num1 = num1 + 1;
        num1 += 1;
        num1++; // and -- for subracting 1;

        // Arithmetic ops: + - * / %
        // Assignment ops: = += -= *= /= %= ++ --

        int test = 3/4; // equals zero cuz of int division; use 3/4.0 instead
        System.out.println(test);

        final double PI = 3.14159;

        double myWallet = 52353.2421;

        double myWrounded = Math.round(myWallet * 100.0) / 100.0;

        System.out.println(myWrounded);
        System.out.printf("myWrounded = %.2f \n", myWallet); //%.#f # of decim
    }
}
