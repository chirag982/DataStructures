package linkedlist;

public class Main {
    public static void main(String[] args) {
        
        LinkedList myLinkedList = new LinkedList(1);
        myLinkedList.append(2);
        
        System.out.println();
        // myLinkedList.printList();
        
        System.out.println(myLinkedList.removeLast().value);
        System.out.println(myLinkedList.removeLast().value);
        System.out.println(myLinkedList.removeLast());
        
        // System.out.println();
        // myLinkedList.getHead();
        // myLinkedList.getTail();
        // myLinkedList.getLength();
        // myLinkedList.printList();

    }   
}
