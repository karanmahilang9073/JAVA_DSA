package two_pointer;
import java.util.Scanner;
// Count All Unique Triplets That Sum to Zero
// Given a sorted integer array arr[], find the number of distinct triplets (i, j, k) (with i < j < k) such that
public class Q3 {
    public static int uniqTriplet(int[] arr) {
        int count = 0;
        int n = arr.length;

        for (int i = 0; i < n - 2; i++) {
            // Skip duplicates for the first element
            if (i > 0 && arr[i] == arr[i - 1]) continue;

            int left = i + 1;
            int right = n - 1;

            while (left < right) {
                int sum = arr[i] + arr[left] + arr[right];
                if (sum == 0) {
                    count++;
                    left++;
                    right--;
                    // Skip duplicates for left and right
                    while (left < right && arr[left] == arr[left - 1]) left++;
                    while (left < right && arr[right] == arr[right + 1]) right--;
                } else if (sum < 0) {
                    left++;
                } else {
                    right--;
                }
            }
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(uniqTriplet(arr));
    }
}

// 6    
// -4 -1 -1 0 1 2
// 2 -----> output