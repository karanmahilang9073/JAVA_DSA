package practice;

public class Evendigit {
     public static void main(String[] args) {
        int[] arr={12,345,2,6,7896};
        System.out.println(findNumbers(arr));
    }

    //function to count the digits in a number
    static int digit(int num){
        int count = 0;
        while(num>0){
            count++;
            num = num/10;
        }
        return count;
    }

    //function to check whether a number contains even digits or not
    static boolean even(int num){
        int noofdigit = digit(num);
        if(noofdigit % 2 == 0){
            return true;
        }
        return false;
    }

    static int findNumbers(int[] arr){
        int count = 0;
        for(int num : arr){
            if(even(num)){
                count++;
            }
        }
        return count;
    }
}
