import java.util.Scanner;

public class SumNumber {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter number to be summed:");
        long n = input.nextLong();

        System.out.println("The sum of the digits in "+ n + " is " + sumDigit(n));
        
        input.close();
    }


    public static int sumDigit(long n){
        if (n / 10 == 0) return (int)n % 10;
        else return ((int)n % 10) + sumDigit(n / 10);
    }
}