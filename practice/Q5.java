package practice;
//majority element n/2
import java.util.Scanner;

public class Q5 {
    public static int majorElement(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            int count = 0;
            for (int j = 0; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                }
            }
            if (count > arr.length /2) {
                return arr[i];
                
            }
        }
        return -1;
        
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        int result = majorElement(arr); // ✅ store returned value
        if (result != -1)
            System.out.println(result);
        else
            System.out.println("No Majority Element");
    }
}
