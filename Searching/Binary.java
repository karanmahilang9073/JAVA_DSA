package Array.Searching;
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
        int start = 0; //starts from 0
        int end = arr.length - 1; //end is length of an array - 1

        while (start <= end) {
            //find the mid element
            int mid = start + (end - start) / 2; //mid element
            if (target < arr[mid]) { //if target element is less than middle element
                end = mid-1; // mid - 1 becomes end
            }else if (target > arr[mid ]) { //if target element is greater than middle element 
                start = mid +1; // mid + 1 starts point
            }else{
                return mid;  //if middle element is target element then it returns middle element
            }
        }
        //if target value never found
        return -1;
    }
}
