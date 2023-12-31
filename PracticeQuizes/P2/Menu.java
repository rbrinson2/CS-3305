import java.util.Scanner;

/**
 * Menu
 */
public class Menu {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        PrintMenu();
        int n = InputFunction(input);

        while (n != 0){
            if (n == 1){
                AddTwoNumbers(input);
            }
            else if (n == 2){
                factorial(input);
            }
            else if (n == 3){
                sumDigit(input);
            }

            System.out.println("Enter a new option.");
            PrintMenu();
            n = InputFunction(input);
        }
        input.close();
    }


    public static void PrintMenu(){
        System.out.println("Make a selction from the list:");
        System.out.println("    1: Add two numbers.");
        System.out.println("    2: Factorial of a number.");
        System.out.println("    3: Sum the digits of a number");
        System.out.println("    0: Quite");
    }

    public static int InputFunction(Scanner in){
        int n = in.nextInt();
        while ((n > 3) || (n < 0)){
            System.out.println("Invalid choice");
            System.out.println("Make a valide Choice:");
            n = in.nextInt();
        }

        return n;
    }

    public static void AddTwoNumbers(Scanner in){
        System.out.print("First Digit: ");
        double d1 = in.nextDouble();
        System.out.print("Second Digit: ");
        double d2 = in.nextDouble();
        System.out.printf("%.1f + %.1f = %.1f \n", d1, d2, d1 + d2);
    }

    public static void factorial(Scanner in){
        System.out.print("Factorial Number: ");
        int n1 = in.nextInt();
        System.out.println("The factorial of " + n1 + " is " + factorial(n1));
    }
    public static long factorial(int n){
        // If the passed value is 0 return 1
        if (n == 0) return 1;

        // If the passed value is not 0 pass a decrimented value to another instance of
        // factorial and multiply that by the initial value
        else return n * factorial(n - 1);
    }

    public static void sumDigit(Scanner in){
        System.out.print("Sum digits of Number: ");
        long l1 = in.nextLong();
        System.out.println("The sum of the digits for " + l1 + " is " + sumDigit(l1));
    }
    public static int sumDigit(long n){
        if (n / 10 == 0) return (int)n % 10;
        else return ((int)n % 10) + sumDigit(n / 10);
    }
}