package questions_only_external;
//find longest subarray using brute force algorithm

public class Q2 {
    public static int longetsubarr(int arr[], int k) {
        int n = arr.length;
        int maxlen = 0;

        // pick every starting index i
        for (int i = 0; i < n; i++) {
            int sum = 0;

            // pick every ending index j >= i
            for (int j = i; j < n; j++) {
                sum += arr[j]; 

                // if subarray sum equals k
                if (sum == k) {
                    maxlen = Math.max(maxlen, j - i + 1); 
                }
            }
        }
        return maxlen;
    }
    public static void main(String[] args) {
        int arr[] = {10,5,2,7,1,9};
        int k = 15;
        System.out.println(longetsubarr(arr, k));
    }   
}
//time complexity--O(n^2)
//space complexity--O(n)