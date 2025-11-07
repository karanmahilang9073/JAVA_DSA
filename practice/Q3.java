package practice;
import java.util.Scanner;
//Find the first non-repeating character in a string
public class Q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a string");
        String str = sc.nextLine().toLowerCase();//lowercase for consistency

        char result = 0;
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            int count = 0;
            for (int j = 0; j < str.length(); j++) {
                if (str.charAt(j) == ch) {
                    count++;
                }
            }
            if (count == 1) {
                result = ch;
                break;
            }
        }
        if (result != 0) {
            System.out.println("the first non repeating chacacter is : " + result);
        }else{
            System.out.println("no unique character found");
        }
        sc.close();
    }
}


// enter a string
// karan
// the first non repeating chacacter is : k