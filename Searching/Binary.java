package Searching;
public class Binary {
    public static void main(String[] args) {
        int[] arr = {2,3,4,5,15,16,18,22,45};
        int target = 2;
        int ans = binarySearch(arr, target);
        System.out.println(ans);
    }
    //return the index
    //return -1 if doesnt contain that element
    static int binarySearch(int[] arr, int target){
        int start = 0; 
        int end = arr.length - 1; 

        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target < arr[mid]) { 
                end = mid-1; 
            }else if (target > arr[mid ]) { 
                start = mid +1; 
            }else{
                return mid;  
            }
        }
        return -1;
    }
}
