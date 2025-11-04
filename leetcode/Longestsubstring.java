package leetcode;
import java.util.*;

class Solution {
    public int longestsubstring(String s) {
        int res = 0;
        int left = 0;
        char[] arr = s.toCharArray();
        Map<Character, Integer> map = new HashMap<>();

        for (int right = 0; right < arr.length; right++) {
            int index = map.getOrDefault(arr[right], -1);
            if (index >= left) {
                left = index + 1;
            }
            map.put(arr[right], right);
            res = Math.max(res, right - left + 1);
        }

        return res;
    }
    public static void main(String[] args) {
        Solution sol = new Solution();
        String a = "abcabcajs";
        System.out.println(sol.longestsubstring(a));///5

    }
}
