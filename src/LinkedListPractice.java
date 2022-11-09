import java.util.LinkedList;

public class LinkedListPractice {
    /*
    Because linkedlist and arraylist both all implement List interface
    Therefore, they both have size(), add(), get() method
     */
    public static void main(String[] args) {
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("BMW");
        linkedList.add("Audi");
        linkedList.add("Lexus");
        linkedList.add("Benz");
        for (int i = 0; i < linkedList.size(); i++) {
            System.out.print(linkedList.get(i) +" ");
        }
    }
}
