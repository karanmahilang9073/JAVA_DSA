package practice;
public class Fibinacci {
    public static void main(String[] args) {
        int n = 10; // number of terms to display
        int first = 0, second = 1;

        for (int i = 1; i <= n; i++) {
            System.out.print(first + " ");

            int next = first + second;
            first = second;
            second = next;
        }
        System.out.print("Fibonacci Series up to " + n + " terms: ");
    }
}
//0 1 1 2 3 5 8 13 21 34 Fibonacci Series up to 10 terms: 