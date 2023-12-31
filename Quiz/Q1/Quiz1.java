import java.text.Collator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/**
 * Quiz1
 */
public class Quiz1 {
    static int count = 0;
    public static void main(String[] args) {
        String[] names = {"red", "green", "blue"};

        System.out.println(Collections.max(Arrays.asList(names)));
    }

    public static void printStar(int n){
        if (n > 0){
            printStar(n - 1);
            for (int i = 0; i < n; i++){
                System.out.print("*");
            }
            System.out.println("\n");
        }
    }

    public static int f(int n){
        count++;
        if (n==0) return 1;
        else return f(n-1) + n * n;
    }
}