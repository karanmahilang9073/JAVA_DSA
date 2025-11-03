package hackerrank;
//Sam's house has an apple tree and an orange tree that yield an abundance of fruit. Using the information given below, determine the number of apples and oranges that land on Sam's house.

import java.util.Scanner;

public class appleorange {
    public static void countappleoranges(int s, int t, int a, int b, int[] apples, int[] oranges){
        int applecount = 0;
        int orangecount = 0;
        for (int i = 0; i < apples.length; i++) {
            int appleposition = a + apples[i];
            if (appleposition >= s && appleposition <= t) {
                applecount++;
            }
        }

        for (int i = 0; i < oranges.length; i++) {
            int orangeposition = b + oranges[i];
            if (orangeposition >= s && orangeposition <= t) {
                orangecount++;
            }
        }
        System.out.println("apples fell inside sams house : "+applecount);
        System.out.println("oranges fell inside sams  house : "+orangecount);
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter start and end points of Sam’s house (s t): ");
        int s = sc.nextInt();
        int t = sc.nextInt();

        System.out.print("Enter locations of apple tree and orange tree (a b): ");
        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.print("Enter number of apples and oranges (m n): ");
        int m = sc.nextInt(); //size of apple tree
        int n = sc.nextInt(); //size of orange tree

        int[] apples = new int[m];
        System.out.println("Enter " + m + " distances apples fall (space-separated): ");
        for (int i = 0; i < apples.length; i++) {
            apples[i] = sc.nextInt();
        }

        int[] oranges = new int[n];
        System.out.println("Enter " + n + " distances oranges fall (space-separated): ");
        for (int i = 0; i < oranges.length; i++) {
            oranges[i] = sc.nextInt();
        }

        countappleoranges(s, t, a, b, apples, oranges);
    }
}
