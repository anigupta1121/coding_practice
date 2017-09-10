package practice.graph;

import java.util.Iterator;
import java.util.LinkedList;

/**
 * Created by guptaanirudh100 on 8/6/2017.
 */
public class BfsImplementation {
    public static void main(String[] args) {
        Graph g = new Graph(9);

        g.addEdge(0, 1);
        g.addEdge(0, 5);
        g.addEdge(0, 7);
        g.addEdge(1, 2);
        g.addEdge(5, 6);
        g.addEdge(2, 8);
        g.addEdge(6, 8);
        g.addEdge(2, 3);
        g.addEdge(4, 3);
        g.addEdge(4, 6);
        g.addEdge(4, 8);

        System.out.println("Following is Breadth First Traversal (starting from vertex 0): ");
        BfsImplementation bfsImplementation=new BfsImplementation();
        bfsImplementation.bfs(0,g);
    }

    public void bfs(int source,Graph graph){
        int v=graph.v;
        LinkedList<Integer> adj[]=graph.adj;
        // Mark all the vertices as not visited (by default set as false)
        boolean visited[] = new boolean[v];

        // Create a queue for BfsImplementation
        LinkedList<Integer> queue = new LinkedList<>();

        // Mark the current node as visited and enqueue it
        visited[source] = true;
        queue.add(source);

        while (queue.size() != 0) {

            // Dequeue a vertex from queue and print it
            source = queue.poll();
            System.out.print(source + " ");

            // Get all adjacent vertices of the dequeued vertex source
            Iterator<Integer> iterator = adj[source].listIterator();

            // If an adjacent vertex has not been visited, then mark it visited and "enqueue" it
            while (iterator.hasNext()) {
                int n = iterator.next();

                if (!visited[n]) {
                    visited[n] = true;
                    queue.add(n);
                }
            }

        }
    }
}
