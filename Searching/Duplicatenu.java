package Searching;
// find duplicate numbers


public class Duplicatenu {
    public static void main(String[] args) {
        int[] arr = {1,3,2,4,5,3,8};
        System.out.println(duplicate(arr));
    }

    static int duplicate (int [] arr){
        int i = 0;
        while(i < arr.length){
            
            if (arr[i] != i + 1) {
                int correctindex = arr[i] - 1;
                if (arr[i] != arr[correctindex]) {
                    swap (arr, i, correctindex);
                } else {
                    return arr[i];
                }
            } else {
                i++;
            }
        }
        return -1;
    }

    static void swap(int[] arr, int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
