package graphs;

public class main {
    public static void main(String[] args) {

        // Graph myGraph = new Graph();
        // myGraph.addVertex("A");
        // myGraph.printGraph();


        Graph myGraph = new Graph();
        myGraph.addVertex("A");
        myGraph.addVertex("B");
        myGraph.addEdge("A", "B");
        myGraph.printGraph();
    
    }
}
