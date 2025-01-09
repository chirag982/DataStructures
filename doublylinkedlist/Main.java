package doublylinkedlist;

public class Main {
    public static void main(String[] args) {
        
        // DoublyLinkedList myDLL = new DoublyLinkedList(7);
        // myDLL.getHead();
        // myDLL.getTail();
        // myDLL.getLength();
        // myDLL.printlist();


        // DoublyLinkedList myDLL = new DoublyLinkedList(1);
        // System.out.println("");
        // myDLL.printlist();
        // myDLL.append(2);
        // myDLL.printlist();


        // DoublyLinkedList myDLL = new DoublyLinkedList(1);
        // myDLL.append(2);
        // System.out.println("");
        // System.out.println(myDLL.removeLast().value);
        // System.out.println(myDLL.removeLast().value);
        // System.out.println(myDLL.removeLast());


        // DoublyLinkedList myDLL = new DoublyLinkedList(0);
        // myDLL.append(1);
        // myDLL.append(2);
        // myDLL.append(3);
        // System.out.println(" ");
        // System.out.println(myDLL.get(1).value);
        // System.out.println(myDLL.get(2).value + "\n");
        // myDLL.printlist();


        // DoublyLinkedList myDLL = new DoublyLinkedList(11);
        // myDLL.append(3);
        // myDLL.append(23);
        // myDLL.append(7);
        // myDLL.set(1,4);
        // System.out.println("");
        // myDLL.printlist();


        // DoublyLinkedList myDLL = new DoublyLinkedList(1);
        // myDLL.append(3);
        // System.out.println("");
        // myDLL.insert(1,2);
        // myDLL.printlist();

        DoublyLinkedList myDLL = new DoublyLinkedList(0);
        myDLL.append(1);
        myDLL.append(2);

        System.out.println("");
        myDLL.remove(1);
        myDLL.printlist();

    }    
}
