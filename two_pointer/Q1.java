package two_pointer;

import java.util.Scanner;

//pair sum
// Given a sorted array of integers and a target number,
// find if there exists a pair of elements that sum to the target.
public class Q1 {
    public static boolean pairsum(int[] arr, int target){
        int left = 0;
        int right = arr.length - 1;
        while (left < right) {
            int sum = arr[left] + arr[right];
            if (sum == target) {
                return true;
            }else if (sum < target) {
                left++;
            }else {
                right--;
            }
        }
        return false;
        
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int target = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(pairsum(arr, target));

    }
}

// 4 
// 5
// 1 2 3 4
// true