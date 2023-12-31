


// Name: Ryan Brinson
// Class: CS 3305/W04
// Term: Fall 2023
// Instructor: Carla McManus
// Assignment: 06-Part-2.1-Time

public class A6P22 {
    public static void main(String[] args) {

        // Array of distances in miles
        Integer[] distArr = {0, 10, 20, 30, 40, 50, 60, 70, 80, 90};
        
        // Print out each conversion from miles to kilometers
        for (Integer mi : distArr) {
            System.out.printf("%d miles = %.0f kilometers\n", mi, milesToKilometers(mi));
        } 
        
    }

    // ----- Methods -----

    // Function that converts miles to kilometers
    public static Double milesToKilometers(Integer mi) {
        return (mi * 1.6);
    }

    
}
