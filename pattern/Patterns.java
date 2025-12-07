package pattern;

public class Patterns {
    // static void pattern1(int n){
    //     for (int row = 1; row <= n; row++) {
    //         for (int col = 1; col <= row ; col++) {
    //             System.out.print("*");
    //         }
    //         System.out.println("");
    //     }
    // }

    // static void pattern2(int n){ //opposite of above 
    //     for (int row = 1; row <= n; row++){
    //          // Print stars for this row
    //          // Number of stars goes down each row
    //         for (int col = 1; col <= n-row+1; col++) {
    //             System.out.print("*");
    //         }
    //         System.out.println();
    //     }
    // }

    // static void pattern3(int n){
    //     for (int row = 1; row <= n; row++) {
    //         for (int col = 1; col <= row; col++) {
    //             System.out.print(col);
    //         }
    //         System.out.println();
    //     }
    // }

    // static void pattern4(int n) {
    // for (int row = 1; row <= n; row++) {
    //     for (int col = 1; col <= row; col++) {
    //         System.out.print("*");
    //     }
    //     System.out.println();
    // }
    // // Bottom half (n-1 down to 1)
    // for (int row = n - 1; row >= 1; row--) {
    //     for (int col = 1; col <= row; col++) {
    //         System.out.print("*");
    //     }
    //     System.out.println();
    //     }
    // }

    // static void Pyramid(int n) {
    //     for (int i = 1; i <= n; i++) {
    //         // Print spaces
    //         for (int j = 1; j <= n - i; j++) {
    //             System.out.print(" ");
    //         }
    //         // Print stars
    //         for (int k = 1; k <= (2 * i - 1); k++) {
    //             System.out.print("*");
    //         }
    //         System.out.println();
    //     }
    // }

    // static void diamond(int n) {
    // // Upper part
    //     for (int i = 1; i <= n; i++) {
    //         // spaces
    //         for (int s = 1; s <= n - i; s++) {
    //             System.out.print(" ");
    //         }
    //         // stars
    //         for (int star = 1; star <= (2 * i - 1); star++) {
    //             System.out.print("*");
    //         }
    //         System.out.println();
    //     }
    //     // Lower part
    //     for (int i = n - 1; i >= 1; i--) {
    //         // spaces
    //         for (int s = 1; s <= n - i; s++) {
    //             System.out.print(" ");
    //         }
    //         // stars
    //         for (int star = 1; star <= (2 * i - 1); star++) {
    //             System.out.print("*");
    //         }
    //         System.out.println();
    //     }
    // }

    // static void patternFloyd(int n) {
    //     int num = 1;
    //     for (int row = 1; row <= n; row++) {
    //         for (int col = 1; col <= row; col++) {
    //             System.out.print(num + " ");
    //             num++;
    //         }
    //         System.out.println();
    //     }
    // }

    // static void hollowSquare(int n) {
    //     for (int i = 1; i <= n; i++) {
    //         for (int j = 1; j <= n; j++) {

    //             if (i == 1 || i == n || j == 1 || j == n) {
    //                 System.out.print("* ");
    //             } else {
    //                 System.out.print("  ");
    //             }

    //         }
    //         System.out.println();
    //     }
    // }

    

    public static void main(String[] args) {
        // pattern1(4);
        // pattern2(4);
        // pattern3(4);
        // pattern4(4);
        // diamond(4);
        // patternFloyd(6);
        // hollowSquare(4);
        // Pyramid(4);
        
        
        
    }
}
