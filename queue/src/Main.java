import java.util.ArrayDeque;
import java.util.Deque;

public class Main {
    public static void main(String[] args) {
        Deque<String> queue = new ArrayDeque<>();

        //Add an element at the top of the stack
        queue.addLast("d");
        queue.addLast("a");
        queue.addLast("n");
        queue.addLast("i");


        //Get an element at the top of the stack
        System.out.println(queue.peekFirst());

        //Remove an element at the top of the stack
        queue.removeFirst();

        //Remove all the element of the stack
        queue.clear();
    }
}