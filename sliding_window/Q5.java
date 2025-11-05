package sliding_window;
//Picking Numbers
// Given an array of integers, find the length of the longest subsequence where the absolute difference between any two elements ≤ 1.

import java.util.Arrays;
import java.util.Scanner;

public class Q5 {
    public static int pickingnum(int[] arr){
        Arrays.sort(arr);
        int left = 0;
        int maxlen = 0;

        int n = arr.length;
        for (int right = 0; right < n; right++) {
            while (arr[right] - arr[left] > 1) {
                left++;
            }
            maxlen = Math.max(maxlen, right - left +1);
        }
        return maxlen;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(pickingnum(arr));
    }
}

//O(n log n) — sorting + O(n) window

// 6
// 4 6 5 3 3 1
// 3