package leetcode;
import java.util.*;

class Solution {
    public static int longestsubstring(String s) {
        int res = 0;
        int left = 0;
        char[] arr = s.toCharArray();
        Map<Character, Integer> map = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {
            int index = map.getOrDefault(arr[i], -1);
            if (index >= left) {
                left = index + 1;
            }
            map.put(arr[i], i);
            res = Math.max(res, i - left + 1);
        }

        return res;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        System.out.println(longestsubstring(s));

    }
}
