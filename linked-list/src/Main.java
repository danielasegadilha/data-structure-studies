import com.daniela.SinglyLinkedList;

public class Main {
    public static void main(String[] args) {
        SinglyLinkedList list = new SinglyLinkedList();

        list.addLast(3);
        list.addLast(4);
        list.addLast(5);
        list.add(2);
        list.add(1);
        list.add(0);

        list.printList();
        System.out.print(System.lineSeparator());

        list.remove();
        list.printList();
        System.out.print(System.lineSeparator());

        list.removeLast();
        list.printList();
        System.out.print(System.lineSeparator());

        list.removeAll();
        list.printList();
    }
}