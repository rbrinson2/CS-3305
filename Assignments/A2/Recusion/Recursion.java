// Name:	Ryan Brinson	
// Class:	CS 3305 W04
// Term:	Spring 2023
//	Instructor:  Carla McManus
//	Assignment:  2 – Part 2 Recursion

import java.util.Scanner;

public class Recursion {
    public static final int MIN = 1;
    public static void main(String[] args) {
        Integer max = 0;
        Scanner input = new Scanner(System.in);

        // Grab the user defined value
        max = init(input);

        // Recusion works it's way from a floor to a user entered max value
        recusionFunc(max, MIN);

        input.close();

    }

    public static int init(Scanner in){
        System.out.println("Enter a number of times for recusion: ");

        do {
            if (in.hasNextInt()) return in.nextInt();
            else {
                System.out.println("Please enter a valid number: ");
                in.nextLine();
            }
        } while (in.hasNext());

        return in.nextInt();
    }

    public static void recusionFunc(int max, int min){
        if (max >= min){
            // Set the indention size based on the recusion level
            for (int i = 0; i < min; i ++) System.out.print(" ");
            System.out.println("This was written by call number " + min);

            // Call the recursion increasing the lower bound by 1
            recusionFunc(max, min + 1);

            // After the recusion is called it works it's way back to the start
            for (int i = 0; i < min; i ++) System.out.print(" ");
            System.out.println("This was ALSO written by call number " + min);
        }
    }
}