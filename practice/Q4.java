package practice;
import java.util.Scanner;
//Find Missing Number in an Array
public class Q4 {
    public static int missingNum(int[] arr){
        int n = arr.length+1;
        int total = n * (n+1)/2;
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        int missing = total - sum;
        return missing;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(missingNum(arr));
        sc.close();
    }
}
//5
// 1 2 4 5 6
// 3