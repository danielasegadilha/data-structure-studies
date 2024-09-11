import com.daniela.Stack;

public class Main {
    public static void main(String[] args) {
        Stack stack = new Stack();

        stack.add(4);
        stack.add(3);
        stack.add(2);
        stack.add(1);
        stack.add(0);
        stack.get(0);
        stack.get(2);

        stack.printStack();
        System.out.print(System.lineSeparator());

        stack.remove();
        stack.printStack();
        System.out.print(System.lineSeparator());

        stack.set(10, 2);
        stack.printStack();
        System.out.print(System.lineSeparator());

        stack.removeAll();
        stack.printStack();
    }
}