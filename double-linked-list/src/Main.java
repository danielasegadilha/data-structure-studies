import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {

        LinkedList<Integer> doubleList = new LinkedList<>();

        //Adding

        //Add an element at the end of the list
        doubleList.add(1);
        doubleList.add(3);
        //Add an element at the beginning of the list
        doubleList.addFirst(2);


        //Get

        //Get an element in a specific position
        System.out.println(doubleList.get(1));
        //Get an element at the end of the list
        System.out.println(doubleList.getLast());
        //Get an element at the beginning of the list
        System.out.println(doubleList.getFirst());


        //Set

        //Change an element in a specific position
        doubleList.set(0,2);


        //Remove

        //Remove an element in a specific position
        doubleList.remove(0);
        //Remove an element at the end of the list
        doubleList.removeLast();
        //Remove an element at the beginning of the list
        doubleList.removeFirst();

    }
}