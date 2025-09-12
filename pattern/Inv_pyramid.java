package pattern;

public class Inv_pyramid {
    public static void main(String[] args) {
        int n = 5;
        for (int i = n; i >= 1; i--) {
            //space
            for (int j = 1; j <= n-i; j++) {
                System.out.print(" ");
            }
            //stars
            for (int j = 1; j <= 2*i-1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
