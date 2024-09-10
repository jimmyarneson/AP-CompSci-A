package Q1;

public class prog88a {
    public static void main(String[] args) {
        // Enter num 1-13
        //Enter num 2 -20
        // Math.random() * (max - min) + min;
        int num1 = (int) (Math.random() * (13 - 1)) + 1;
        int num2 = (int) (Math.random() * (20 - 2)) + 2;
        int sum = num1 + num2;
        int dif = num1 - num2;
        // TODO prduct and avg
        int abs = Math.abs(dif);
        int max, min;
        int prod = num1 / num2;
        int avg = sum / 2;

        // the code inside 'if; will only run if the condition is true
        if (num1 > num2) {
            max = num1;
            // min = num2;
        } else {
            max = num2;
            if (max == num1) {
                min = num2;
            } else {
                min = num1;
            }
            System.out.println("Original numbers are " + num1 + " and " + num2);
            System.out.println("Sum = " + sum);
            System.out.println("Difference = " + dif);
            System.out.println("Absolute Difference = " + abs);
            System.out.println("Product = " + prod);
            System.out.println("Average = " + avg);
            //TODO: print the rest;
            System.out.println("Maximum = " + max);
            System.out.println("Miniumum = " + min);

        }

        //check if 'max' and 'num1' are the same value using ==
    }
    }

    /*
    Original numbers are 9 and 13
Sum = 22
Difference = -4
Absolute Difference = 4
Product = 0
Average = 11
Maximum = 13
Miniumum = 9
     */
