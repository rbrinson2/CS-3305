import java.util.Scanner;


public class Chapter18 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        double[] arr = {3,8,3,9,4,7,8};
        sort(arr);
        for (double in : arr){
            System.out.print(in + ",");
        }

        input.close();
    }

    /*------------------------------------------------------------------------ */
    public static long factorial(int n){
        if (n == 0) return 1;
        else return n * factorial(n - 1);
    }

    public static long fib( long index){
        if (index == 0) return 0;
        else if (index == 1) return 1;
        else return fib(index - 1) + fib(index - 2);
    }

    public static boolean isPalindrome(String s){
        if (s.length() <= 1) return true;
        else if (s.charAt(0) != s.charAt(s.length() - 1)) return false;
        else return isPalindrome(s.substring(1, s.length() - 1));
    }

    public static void sort(double[] list){
        sort(list, 0, list.length - 1);
    }
    private static void sort(double[] list, int low, int high){
        if (low < high) {
            int indOfMin = low;
            double min = list[low];
            for (int i = low + 1; i <= high; i++ ){
                if (list[i] < min){
                    min = list[i];
                    indOfMin = i;
                }
            }
            list[indOfMin] = list[low];
            list[low] = min;
            sort(list, low + 1, high);
        }
    }
}


