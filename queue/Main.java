package queue;

public class Main {
    public static void main(String[] args) {
        
        // Queue myQueue = new Queue(7);
        // myQueue.getFirst();
        // myQueue.getLast();
        // myQueue.getLength();
        // myQueue.printQueue();


        // Queue myQueue = new Queue(1);
        // myQueue.enqueue(2);
        // System.out.println("");
        // myQueue.printQueue();


        Queue myQueue = new Queue(2);
        myQueue.enqueue(1);
        System.out.println("");
        System.out.println(myQueue.dequeue().value);
        System.out.println(myQueue.dequeue().value);
        System.out.println(myQueue.dequeue());
    }
    
}
