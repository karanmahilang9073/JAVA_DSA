package Array.Searching;
public class Linearsearch {
    public static void main(String[] args) {
        //find the target element--------------
        int[] a = {45,75,46,789,35};
        int target = 46;
        int ans = linearSearch(a, target);
        System.out.println(ans);

    }
    static int linearSearch(int[] arr, int target){
        if(arr.length == 0){
            return -1;
        }
        for (int i = 0; i < arr.length; i++) {
            int element = arr[i];
            if(element == target){
                return i;   // here we can return index or exact value that is present or not
            }
        }
        return -1;
    }
}
