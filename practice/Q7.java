package practice;
//Mini-Max Sum

import java.util.Scanner;

public class Q7 {
    public static  void minmax(int[] arr){
        long sum = 0;
        int min = arr[0];
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
            if(arr[i] < min) min = arr[i];
            if(arr[i] > max) max = arr[i];  
        }
        long minsum = sum - max;
        long maxsum = sum - min;
        System.out.println(minsum + " " +maxsum );
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        minmax(arr);
    }
}

// 3
// 1 2 3
// 3 5 ----output