package Array.Searching;
import java.util.ArrayList;
import java.util.List;

public class Missing2 {
    public static void main(String[] args) {
        int[] arr = {7,3,4,2,8,2,3,1};
        System.out.println(finddissappearednumber(arr));
    }

    public static List<Integer> finddissappearednumber(int [] arr){
        int i = 0;
        while( i < arr.length){
            int correctindex = arr[i] -1 ;
            if(arr[i] < arr.length && arr[i] != arr[correctindex]){
                swap(arr, i, correctindex);
            }else{
                i++;
            }
        }

        // search for missing number
        List<Integer> ans = new ArrayList<>();
        for (int index = 0; index < arr.length; index++) {
            if(arr[index] != index + 1){
                ans.add(index + 1);
            }   
        }
        return ans;
    }

    static void swap(int[] arr, int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
