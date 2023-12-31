import java.util.*;

public class Chap2024 {
    public static final int ADD = 1;
    public static final int REMOVE = 2;
    public static final int QUITE = 0;
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<Integer> intArr = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9));

        Collections.shuffle(intArr);

        // Alter the ArrayList
        intArr = AddToArr(intArr, input);

        // Create the linked list out of the Array
        LinkedList<Integer> intLink = new LinkedList<>(intArr);
        intLink = LinkAddRemove(intLink, input);

        PrintList(intLink);
    }

    public static ArrayList<Integer> AddToArr(ArrayList<Integer> arr, Scanner in){
        int index = 0;
        int number = 0;
        char c = 'n';

        do {
            // Print Array
            System.out.println("The current array is: \n" + arr);
            System.out.println("Do you want to insert value? [y/n]");
            c = in.next().charAt(0);
            if (c == 'y'){
                // Get index
                System.out.println("Enter location 0-"+(arr.size() - 1));
                index = in.nextInt();
                // Get Value
                System.out.println("Enter value: ");
                number = in.nextInt();

                // Insert into array
                arr.set(index, number);
            }
            else c = 'n';
        } while (c == 'y');
        return arr;
    }

    public static LinkedList<Integer> LinkAddRemove(LinkedList<Integer> link, Scanner in){
        int option = QUITE;
        int index = 0;
        int number = 0;
        char c = 'n';


        do {
            System.out.println("Current List: \n" + link);
            System.out.println("Do you want to alter the list? [y/n]");
            c = in.next().charAt(0);
            if (c == 'y') {
                System.out.println("Select an option: ");
                System.out.println(" Add - 1\n Remove - 2\n Cancel - 0");
                System.out.print("Choice: ");
                option = in.nextInt();

                if (option == ADD){
                    // Get index
                    System.out.println("Enter location 0-"+(link.size() - 1));
                    index = in.nextInt();
                    // Get Value
                    System.out.println("Enter value: ");
                    number = in.nextInt();

                    // Insert into list
                    link.set(index, number);
                }
                else if (option == REMOVE) {
                    // Get index
                    System.out.println("Enter location 0-"+(link.size() - 1));
                    index = in.nextInt();

                    // Remove from list
                    link.remove(index);
                }
                else if (option == QUITE) break;
            }
            else c = 'n';
        } while (c == 'y');

        return link;
    }

    public static void PrintList(LinkedList<Integer> link){
        ListIterator<Integer> iterator = link.listIterator();

        System.out.println("List printed forward: ");
        while (iterator.hasNext()) System.out.print(iterator.next() + " ");

        iterator = link.listIterator(link.size());
        System.out.println("\nnList printed backward: ");
        while (iterator.hasPrevious()) System.out.print(iterator.previous() + " ");
    }
}
