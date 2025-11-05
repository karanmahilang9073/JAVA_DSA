package two_pointer;
//Count All Pairs That Sum to Target

import java.util.Scanner;

// You’re given a sorted array of integers and a target value.
// Find how many pairs of numbers add up to the target.

public class Q2 {
    public static int pairsum(int[] arr, int target){
        int left = 0;
        int right = arr.length -1;
        int count = 0;
        while (left < right) {
            int sum = arr[left] + arr[right];
            if (sum == target) {
                count++;
                left++;
                right--;
            }else if (sum < target) {
                left++;
            }else {
                right--;
            }
        }
        return count;
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


// 5
// 6
// 1 2 3 4 5
// 2------> output