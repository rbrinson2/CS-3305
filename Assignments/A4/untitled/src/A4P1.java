
public class A4P1 {

    public static void main(String[] args) {
        Array arr = new Array(4,5);

        for (int i = 0; i < 10; i++) {
            // Assign random values to each element of stack A
            arr.push_a((int) (Math.random() * 10));
        }
        for (int i = 0; i < 10; i++) {
            // Assign random values to each element of stack A
            arr.push_b((int) (Math.random() * 10));
        }

        arr.print_a();
        System.out.println();
        arr.print_b();
    }
}


class Array {
    private int[] StackA;
    private int[] StackB;
    private int top_a;
    private int top_b;

    Array(int stackASize, int stackBSize){
        // Stack default value is -1, representing an empty stack
        top_a = -1;
        top_b = -1;
        StackA = new int[stackASize];
        StackB = new int[stackBSize];
    }

    // ----- Print Stack -----
    public void print_a(){
        for (int i : StackA){
            System.out.println(i);
        }
    }
    public void print_b(){
        for (int i : StackB){
            System.out.println(i);
        }
    }
    // ----- is Full ----
    public boolean is_full(){
        // Check if both stacks have reached there limit
        return (top_a >= StackA.length)
                &&
                (top_b >= StackB.length);
    }
    // ----- Is Empty -----
    public boolean is_empty_a(){
        return top_a < 0;
    }
    public boolean is_empty_b(){ return top_b < 0; }

    // ----- Push -----
    public void push_a(int n){
        if(top_a == (StackA.length - 1)) System.out.println("Stack full");
        else {
            StackA[top_a + 1] = n;
            top_a++;
        }
    }
    public void push_b(int n){
        if(top_b == (StackB.length - 1)) System.out.println("Stack full");
        else {
            StackB[top_b + 1] = n;
            top_b++;
        }
    }


    // ----- Pop -----

    public int pop_a(){
        int temp = StackA[top_a];
        StackA[top_a] = 0;
        top_a--;
        return temp;
    }
    public int pop_b(){
        int temp = StackB[top_b];
        StackB[top_b] = 0;
        top_b--;
        return temp;
    }

}