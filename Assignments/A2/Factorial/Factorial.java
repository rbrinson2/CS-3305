// Name:	Ryan Brinson		
// Class:	CS 3305/ W04
// Term:	Fall 2023
//	Instructor:  Carla McManus
//	Assignment: 2 – Part 1 Factorial


import java.util.Scanner;

public class Factorial {

    public static void main(String[] args) {
        // Initialize the input scanner
        Scanner input = new Scanner(System.in);
        
        // Prompt the user to to enter a value
        System.out.print("Enter a non-negative integer: ");
        int n = input.nextInt();
        
        // Check to make sure the value is greater or equal to 0
        while (n < 0) {
            System.out.println("\nThe number you entered is invalid");
            System.out.print("Enter a non-negative integer: ");
            n = input.nextInt();
        }
        
        // Print and run the factorial simultaniously
        System.out.println("\nThe Factorial of " + n + " is " + factorial(n) + "\n");

        input.close();
    }

    //----- Factorial Subroutine-----//
    public static long factorial(int n){
        // If the passed value is 0 return 1
        if (n == 0) return 1;

        // If the passed value is not 0 pass a decrimented value to another instance of
        // factorial and multiply that by the initial value
        else return n * factorial(n - 1);
    }

}



