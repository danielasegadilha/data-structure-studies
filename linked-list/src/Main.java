import com.daniela.SinglyLinkedList;

public class Main {
    public static void main(String[] args) {
        SinglyLinkedList list = new SinglyLinkedList();

        list.addLast(1);
        list.addLast(2);
        list.addLast(3);
        list.add(0);

        list.printList();

        System.out.print(System.lineSeparator());

        list.removeFirst();
        list.printList();
    }
}