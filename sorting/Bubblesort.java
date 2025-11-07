package sorting;
import java.util.Arrays;

public class Bubblesort {
    public static void main(String[] args) {
         int[] arr = {1,3,2,5,4};
         Bubble(arr);
         System.out.println(Arrays.toString(arr));
    }
    static void Bubble(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            for (int j = 1; j < arr.length - i; j++) {
                if(arr[j] < arr[j-1]){
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                }
            }
        }
    }
}

//1 2 3 4 5