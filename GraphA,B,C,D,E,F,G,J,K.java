public class MatrixGraph {
    private int[][] adjacencyMatrix;
    private int numVertices;

    // Constructor
    public MatrixGraph(int numVertices) {
        this.numVertices = numVertices;
        this.adjacencyMatrix = new int[numVertices][numVertices];
    }

    public void addEdge(int source, int destination) {

        adjacencyMatrix[source][destination] = 1;
        adjacencyMatrix[destination][source] = 1; // Undirected Graph
    }

    public void removeEdge(int source, int destination) {
        adjacencyMatrix[source][destination] = 0;
        adjacencyMatrix[destination][source] = 0;
    }

    public void printGraph() {
        System.out.println("Adjacency Matrix:");

        for (int i = 0; i < numVertices; i++) {
            for (int j = 0; j < numVertices; j++) {
                System.out.print(adjacencyMatrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {

        GraphMatrix graph = new GraphMatrix(9);

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
