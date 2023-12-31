// Name:	Ryan Brinson
// Class:	CS 3305 W04
// Term:	Spring 2023
//	Instructor:  Carla McManus
//	Assignment:  3 – Part 2 Capitals


import java.util.*;

public class GuessTheCapital {
    public static final int STATE = 0;
    public static final int CAPITAL = 1;
    public static int correct = 0;
    public static int wrong = 0;


    public static void main(String[] args) {
        // Initialize the string using the StringInit function
        String[][] stateCities = StringInit();
        Scanner input = new Scanner(System.in);

        // Introduction to the Quiz
        System.out.println("Let's test your knowledge of States and their Capitals.");
        System.out.println("You will be presented with 5 random States and you must try and guess their respective Capital.");
        System.out.println("Let's begin!");


        // Cycle through the five different states
        for (int i = 0; i < 5; i ++){
            System.out.printf("\nQuestion %d\n", i + 1);
            Prompt(input, stateCities);
        }



        System.out.printf("Correct: %d\nWrong: %d", correct, wrong);
    }

    public static void Prompt(Scanner input, String[][] stateCities){
        Random rand = new Random();
        String tempString;
        int tempNum;

        // Set tempNum to a random integer of 0-49
        tempNum = rand.nextInt(stateCities.length);
        System.out.print("What is the capital of ");

        // Using tempNum, pick a random row in the array
        // and print the state column
        System.out.println(stateCities[tempNum][STATE] + "?");

        // Grab the users guess
        tempString = input.nextLine();

        // Using the same index value from about,
        // Check if the users' guess matches the associated capital.
        // If they match, increment correct by 1, if wrong increment wrong by 1
        if ((tempString.equals(stateCities[tempNum][CAPITAL]))
                || (tempString.equals(stateCities[tempNum][CAPITAL].toLowerCase())))
            correct++;
        else wrong++;
    }

    // Function that initializes the array with the necessary values
    public static String[][] StringInit(){
        return new String[][]{{"Alabama", "Montgomery"},
        {"Alaska", "Juneau"},
        {"Arizona", "Phoenix"},
        {"Arkansas", "Little Rock"},
        {"California", "Sacramento"},

        {"Colorado", "Denver"},
        {"Connecticut", "Hartford"},
        {"Delaware", "Dover"},
        {"Florida", "Tallahassee"},

        {"Georgia", "Atlanta"},
        {"Hawaii", "Honolulu"},
        {"Idaho", "Boise"},
        {"Illinois", "Springfield"},

        {"Maryland", "Annapolis"},
        {"Minnesota", "Saint Paul"},
        {"Iowa", "Des Moines"},

        {"Maine", "Augusta"},
        {"Kentucky", "Frankfort"},
        {"Indiana", "Indianapolis"},
        {"Kansas", "Topeka"},

        {"Louisiana", "Baton Rouge"},
        {"Oregon", "Salem"},
        {"Oklahoma", "Oklahoma City"},

        {"Ohio", "Columbus"},
        {"North Carolina", "Raleigh"},
        {"North Dakota", "Bismark"},

        {"New York", "Albany"},

        {"New Mexico", "Santa Fe"},
        {"New Jersey", "Trenton"},
        {"New Hampshire", "Concord"},

        {"Nevada", "Carson City"},
        {"Nebraska", "Lincoln"},
        {"Montana", "Helena"},
        {"Missouri", "Jefferson City"},

        {"Mississippi", "Jackson"},
        {"Massachusetts", "Boston"},
        {"Michigan", "Lansing"},

        {"Pennsylvania", "Harrisburg"},
        {"Rhode Island", "Providence"},

        {"South Carolina", "Columbia"},
        {"South Dakota", "Pierre"},
        {"Tennessee", "Nashville"},
        {"Texas", "Austin"},

        {"Utah", "Salt Lake City"},
        {"Vermont", "Montpelier"},
        {"Virginia", "Richmond"},

        {"Washington", "Olympia"},
        {"West Virginia", "Charleston"},
        {"Wisconsin", "Madison"},
        {"Wyoming", "Cheyenne"}};
    }
}
