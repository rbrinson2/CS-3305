import java.util.LinkedList;

public class P4 {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();

        stack.push(10);
        stack.push(20);
        stack.push(30);

        while (!stack.isEmpty()){
            System.out.printf("Stack index: %d, Value: %d\n", stack.size(), stack.pop());
        }


    }
    
}
class Stack<E> {
    private java.util.LinkedList<E> list = new LinkedList<>();
    
    public void push(E e) {
        list.add(e);
    }
    
    public E pop(){
        return list.removeLast();
    }

    public boolean isEmpty(){
        return list.isEmpty();
    }

    public int size(){
        return list.size();
    }

    public E peek(){
        return list.getLast();
    }
}