package trees.recursivebinarysearchtree;

public class Main {
    public static void main(String[] args) {

        // BinarySearchTree myBST = new BinarySearchTree();

        // myBST.insert(47);
        // myBST.insert(21);
        // myBST.insert(76);
        // myBST.insert(18);
        // myBST.insert(27);
        // myBST.insert(52);
        // myBST.insert(82);

        // System.out.println("\nBST Contains 27:");
        // System.out.println(myBST.rContains(27));

        // System.out.println("\nBST Contains 17:");
        // System.out.println(myBST.rContains(17));

        BinarySearchTree myBST = new BinarySearchTree();
        
        myBST.rInsert(2);
        myBST.rInsert(1);
        myBST.rInsert(3);
        
        System.out.println("\nRoot: " + myBST.root.value);
        System.out.println("\nRoot->Left: " + myBST.root.left.value);
        System.out.println("\nRoot->Right: " + myBST.root.right.value);

    }   
}
