package practice;

public class OrderDiagnostic {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8};
        int target = 6;
        int ans = Orderagnostic(arr, target);
        System.out.println(ans);
    }

    static int Orderagnostic(int[] arr, int target){
        int start = 0;
        int end = arr.length-1;
        //find whether the array is ascending or descending order
        boolean isAsc = arr[start] < arr[end];
        
        while(start <= end){
            int mid = start + (end - start) / 2;

            if (arr[mid] == target) {
                return mid;
            }

            if (isAsc) {
                if(target < arr[mid]){
                    end = mid -1;
                }else {
                    start = mid +1;
                }    
            }else{
                if(target > arr[mid]){
                    end = mid -1;
                }else {
                    start = mid +1;
                }
            }
            
        }
        return -1;
    }
}
