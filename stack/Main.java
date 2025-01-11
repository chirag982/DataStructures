package stack;

public class Main {
    
    public static void main(String[] args) {
        
        // Stack myStack = new Stack(4);
        // System.out.println("");
        // myStack.getTop();
        // myStack.getHeight();
        // myStack.printStack();

        Stack myStack = new Stack(2);
        System.out.println("");
        myStack.getTop();
        myStack.getHeight();
        myStack.printStack();

        myStack.push(1);
        System.out.println("");
        myStack.getTop();
        myStack.getHeight();
        myStack.printStack();

    }

}
