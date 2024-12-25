package linkedlist;

public class Main {
    public static void main(String[] args) {
        
        LinkedList myLinkedList = new LinkedList(1);
        myLinkedList.append(2);
        myLinkedList.append(3);
        myLinkedList.append(4);

        myLinkedList.reverse();

        // myLinkedList.append(23);
        // myLinkedList.append(7);
        // myLinkedList.insert(1, 1);
        
        // System.out.println();
        
        // myLinkedList.Prepend(1);
        // System.out.println(myLinkedList.removeFirst().value);
        // System.out.println(myLinkedList.removeFirst().value);
        // System.out.println(myLinkedList.removeFirst());
        // myLinkedList.set(2,4);
        System.out.println();
        myLinkedList.printList();        
        
        // System.out.println();
        // System.out.println(myLinkedList.get(2).value);
        


        // // myLinkedList.printList();
        
        // System.out.println(myLinkedList.removeLast().value);
        // System.out.println(myLinkedList.removeLast().value);
        // System.out.println(myLinkedList.removeLast());
        
        // System.out.println();
        // myLinkedList.getHead();
        // myLinkedList.getTail();
        // myLinkedList.getLength();
        // myLinkedList.printList();

    }   
}
