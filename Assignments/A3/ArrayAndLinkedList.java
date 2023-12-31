// Name:	Ryan Brinson
// Class:	CS 3305 W04
// Term:	Fall 2023
//	Instructor:  Carla McManus
//	Assignment:  3 – Part 1 Iterator

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Scanner;



public class ArrayAndLinkedList {
    public static final int RANGES = 1;
    public static final int REPETITION = 2;
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        char choice = 'y';

        while (choice != 'n'){
            Assignment.printRanges(input);
            choice = continueFunc(input, RANGES);
        }

        choice = continueFunc(input, REPETITION);
        if (choice == 'y') Assignment.removeRepetitions();


        System.out.println("Thank! Come again!");

    }

    public static char continueFunc(Scanner in, int choice){
        char c = 'y';

        do {
            if (choice == RANGES)
                System.out.println("Choose another range? y/n");
            else if (choice == REPETITION)
                System.out.println("Remove Duplicates? y/n");
            c = in.next().charAt(0);
            if ((c != 'y') && (c != 'n'))
                System.out.println("Please enter a valid choice \n");
        } while ((c != 'y') && c != 'n');

        return c;
    }
}

class Assignment {
    private static final ArrayList<Integer> arr =
            new ArrayList<>(Arrays.asList(1, 1, 2, 3, 3, 4, 4, 5, 6, 7));

    public static void printRanges(Scanner in){
        int x, y;
        System.out.println("Enter x: ");
        x = in.nextInt();
        System.out.println("Enter y: ");
        y = in.nextInt();

        printRanges(x, y);
    }
    public static void printRanges(int x, int y){
        int temp = 0;
        Iterator<Integer> iterator = arr.iterator();
        if (y < x) {
            while (iterator.hasNext()){
                temp = iterator.next();
                if (temp >= x)
                    System.out.print(temp + " ");
            }
        }
        else {
            while (iterator.hasNext()){
                temp = iterator.next();
                if ((temp >= x) && (temp < y))
                    System.out.print(temp + " ");
            }
        }
        System.out.print("\n");
    }
    public static void removeRepetitions(){
        Iterator<Integer> iterator = arr.iterator();
        int p, q;
        p = iterator.next();
        q = iterator.next();

        while (iterator.hasNext()){
            if (p == q) iterator.remove();
            else p = q;
            q = iterator.next();
        }
        printRanges(1, 0);
    }
}
