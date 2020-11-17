package M6Graph;

public class BFSApp {

    public static void main(String[] args) {
        Graph theGraph = new Graph();
        theGraph.addVertex('A'); // 0 (menambah vertex)
        theGraph.addVertex('B'); // 1
        theGraph.addVertex('C'); // 2
        theGraph.addVertex('D'); // 3 
        theGraph.addVertex('E'); // 4 
        theGraph.addEdge(0, 1); // AB
        theGraph.addEdge(1, 2); // BC 
        theGraph.addEdge(0, 3); // AD
        theGraph.addEdge(3, 4); // DE
        System.out.print("Visits: ");
        theGraph.bfs(); // breadth-first search
        System.out.println();
        theGraph.displayVertex(0);
    }
    
}
