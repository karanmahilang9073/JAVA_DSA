package two_pointer;
//container with most water 
import java.util.Scanner;
public class Q5 {
    public static int mostwater(int[] height){
        int left = 0;
        int right = height.length-1;
        int maxArea = 0;
        while (left < right) {
            int width = right - left;
            int h = Math.min(height[left], height[right]);
            int area = width * h;
            maxArea = Math.max(maxArea, area);
            // move the pointer pointing to the shorter line 
            if (height[left] < height[right]) {
                left++;
            }else {
                right--;
            }
        }
        return maxArea;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] height = new int[n];
        for (int i = 0; i < n; i++) {
            height[i] = sc.nextInt();
        }
        System.out.println(mostwater(height));
        sc.close();
    }
}