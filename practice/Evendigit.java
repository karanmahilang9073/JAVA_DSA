package practice;
import java.util.Scanner;
public class Evendigit {
    
    //function to count the digits in a number
    static int digit(int num){
        int count = 0;
        while(num>0){
            count++;
            num = num/10;
        }
        return count;
    }
    //function to check whether a number contains even digits or not
    static boolean even(int num){
        int noofdigit = digit(num);
        if(noofdigit % 2 == 0){
            return true;
        }
        return false;
    }
    static int findNumbers(int[] arr){
        int count = 0;
        for(int num : arr){
            if(even(num)){
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(findNumbers(arr));
        sc.close();
    }
}
