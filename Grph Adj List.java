 import java.util.*;

public class GraphAdjList {

    private LinkedList<Integer>[] adjList;
    private int numVertices;

    public GraphAdjList(int numVertices) {
        this.numVertices = numVertices;
        adjList = new LinkedList[numVertices];

        for (int i = 0; i < numVertices; i++) {
            adjList[i] = new LinkedList<>();
        }
    }

  
    public void addEdge(int source, int destination) {
        adjList[source].add(destination);
        adjList[destination].add(source); 
    }

    public void printGraph() {

        char vertices[] = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'J', 'K'};

        System.out.println("Adjacency List:");

        for (int i = 0; i < numVertices; i++) {

            System.out.print(vertices[i] + " -> ");

            for (Integer node : adjList[i]) {
                System.out.print(vertices[node] + " ");
            }

            System.out.println();
        }
    }

    public static void main(String[] args) {

        GraphAdjList graph = new GraphAdjList(9);

        // A-B, A-J
        graph.addEdge(0, 1);
        graph.addEdge(0, 7);

        // B-C, B-D
        graph.addEdge(1, 2);
        graph.addEdge(1, 3);

        // C-E, C-F
        graph.addEdge(2, 4);
        graph.addEdge(2, 5);

        // D-E
        graph.addEdge(3, 4);

        // E-G, E-J
        graph.addEdge(4, 6);
        graph.addEdge(4, 7);

        // F-G
        graph.addEdge(5, 6);

        // J-K
        graph.addEdge(7, 8);

        graph.printGraph();
    }
}
    

