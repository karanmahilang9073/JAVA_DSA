package questions_only_external;
// Even a sorted and rotated array arr[] of distinct elements. find the index of given key in the array. if the key is not present in the array return -1
//input: arr[] = [5,6,7,8,9,10,1,2,3], key = 3
//output = 8

public class Q1 {
    static int seaarch(int arr[], int key){
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) 
                return i;
        }
        return -1;
    }
    
    public static void main(String[] args) {
        int arr[] = {5,6,7,8,9,10,1,2,3,4};
        int key = 9;
        int ans = seaarch(arr, key);
        System.out.println(ans); //4 (9 is present in the 4th index)
    }
}
//time complexity = O(n) and space complexity = O(1)
