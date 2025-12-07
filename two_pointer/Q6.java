package two_pointer;
import java.util.Scanner;
//valid palindrome
//given a string determine its palindro or not 
public class Q6 {
    public static boolean isPalindrome(String s){
        if (s == null) {
            return true;
        }
        int left = 0;
        int right = s.length()-1;
        while (left < right) {
            char leftChar = s.charAt(left);
            char rightChar = s.charAt(right);
            //skip non alphanumeric character
            if (!Character.isLetterOrDigit(leftChar)) {
                left++;
                continue;
            }
            if (!Character.isLetterOrDigit(rightChar)) {
                right--;
                continue;
            }
            //compare character (case sensitive)
            if (Character.toLowerCase(leftChar) != Character.toLowerCase(rightChar)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         String S = sc.next();
         System.out.println(isPalindrome(S));
         sc.close();
    }
}
// mam
// true