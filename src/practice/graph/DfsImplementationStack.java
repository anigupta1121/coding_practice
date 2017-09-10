package practice.graph;

import java.util.LinkedList;
import java.util.ListIterator;

/**
 * Created by guptaanirudh100 on 8/7/2017.
 */
public class DfsImplementationStack {

    public static void main(String[] args) {

        Graph g = new Graph(9);

        g.addEdge(0, 1);
        g.addEdge(0, 2);
        g.addEdge(1, 2);
        g.addEdge(2, 0);
        g.addEdge(2, 3);
        g.addEdge(3, 3);

        System.out.println("Following is Depth First Traversal: ");

        DfsImplementationStack dfsImplementationStack = new DfsImplementationStack();
        dfsImplementationStack.dfs(g, 2);
    }

    public void dfs(Graph graph, int i) {
        int v = graph.v;

        //marked all as false by default
        boolean visited[] = new boolean[v];

        dfsUtil(i, visited, graph.adj);


    }

    public void dfsUtil(int v, boolean visited[], LinkedList<Integer>[] adj) {

        visited[v] = true;
        System.out.print(v + " ");
        ListIterator<Integer> it = adj[v].listIterator();
        while (it.hasNext()) {
            int n = it.next();
            if (!visited[n]) {
                dfsUtil(n, visited, adj);
            }
        }
    }
}
