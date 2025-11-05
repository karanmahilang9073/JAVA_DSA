package sliding_window;
//Maximum Average Subarray of Size K
// You are given an integer array arr[] and an integer k.
// Find the maximum average of any contiguous subarray of size k.

import java.util.Scanner;

public class Q2 {
    public static double maxAvg(int[] arr, int k){
        int maxsum = 0;
        int windwsum = 0;
        for (int i = 0; i < k; i++) {
            windwsum += arr[i];
        }
        maxsum = windwsum;

        for (int j = k; j < arr.length; j++) {
            windwsum += arr[j] - arr[j - k];
            if (windwsum > maxsum) {
                maxsum = windwsum;
            }
        }
        return  (double) maxsum/k;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(maxAvg(arr, k));
    }
}

// 4 2
// 1 2 3 4
// 3.5