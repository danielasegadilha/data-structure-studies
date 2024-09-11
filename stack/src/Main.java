import java.util.ArrayDeque;
import java.util.Deque;

public class Main {
    public static void main(String[] args) {
        Deque<String> stack = new ArrayDeque<>();

        //Add an element at the top of the stack
        stack.addFirst("a");
        stack.addFirst("l");

        //Get an element at the top of the stack
        System.out.println(stack.peekFirst());

        //Remove an element at the top of the stack
        stack.removeFirst();

        //Remove all the element of the stack
        stack.clear();
    }
}