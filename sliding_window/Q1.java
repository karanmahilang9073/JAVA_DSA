package sliding_window;
import java.util.Scanner;
//maximum of subarray of size k
// Given an array of integers and a number k,
// find the maximum sum of any contiguous subarray of size k.
public class Q1 {
    public static int maxSubArr(int[] arr, int k){
        int windowsum = 0;
        int sum = 0;
        // Step 1: Compute the window 
        for (int i = 0; i < k; i++) {
            windowsum += arr[i];
        }
        sum = windowsum;
        // Step 2: Slide the window
        for (int j = k; j < arr.length; j++) {
            windowsum += arr[j] - arr[j-k];
            if (windowsum > sum) {
                sum = windowsum;
            }
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(maxSubArr(arr, k));
        sc.close();
    }
}
// 6 3
// 2 1 5 1 3 2
// 9