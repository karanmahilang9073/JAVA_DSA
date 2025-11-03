package practice;

public class Maxsubarray {
    public static int maxsubarray(int[] nums){
        int currentsum = nums[0];
        int maxsum = nums[0];

        for (int i = 1; i < nums.length; i++) {
            if (currentsum + nums[i] > nums[i]) {
                currentsum = currentsum + nums[i];
            }else{
                currentsum = nums[i];
            }

            if (currentsum > maxsum) {
                maxsum = currentsum;
            }
        }
        return maxsum;
    }

    public static void main(String[] args) {
        int[] nums = {-2,1,-3,4,-1,2,1,-5,4};
        int ans = maxsubarray(nums);
        System.out.println("maximum sub array is " + ans);
    }
}
