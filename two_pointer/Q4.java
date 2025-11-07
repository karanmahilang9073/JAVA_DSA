package two_pointer;
// Pairs
// You’re given an array of n unique integers and a target value k.
// Find how many pairs of array elements have a difference equal to k
import java.util.Arrays;
import java.util.Scanner;
public class Q4 {
    public static int pairs(int[] arr, int k){
        Arrays.sort(arr);
        int left = 0;
        int right = 1;
        int n = arr.length;
        int count = 0;
        while (right < n) {
            int diff = arr[right] - arr[left];
            if (diff == k ) {
                count++;
                left++;
                right++;
            }else if (diff < k) {
                right++;
            }else{
                left++;
            }
            if (left == right) {
                right++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(pairs(arr, k));
        sc.close();
    }
}
