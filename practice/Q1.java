package practice;
import java.util.Scanner;

public class Q1 {
    public static int singleNumber(int[] arr){
        int result = 0;
        for(int n : arr){
            result ^= n;
        }
        return result;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // length of array
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Result = " + singleNumber(arr));
        sc.close();
    }
}
