package practice;

import java.util.Scanner;

public class Sumofdigits {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        sc.close();
        int sum = 0;
        while (n > 0) {
            int digit = n % 10;   // get last digit
            sum += digit;        // add to sum
            n /= 10;             // remove last digit
        }
        System.out.println("Sum of digits = " + sum);
    }
}
