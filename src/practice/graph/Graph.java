package practice.graph;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by guptaanirudh100 on 8/6/2017.
 */
public class Graph {

    // No. of vertices
    public int v;

    // Adjacency Lists
    public LinkedList<Integer> adj[];

//    public List<LinkedList<Integer>> adjacent;

    // Constructor for Graph
    @SuppressWarnings("unchecked")
    public Graph(int v) {
        this.v = v;
        adj = new LinkedList[v];
        for (int i = 0; i < v; ++i) {
            adj[i] = new LinkedList<Integer>();
        }
    }

    // Function to add an edge into the graph
    public void addEdge(int v, int w) {
        adj[v].add(w);
        adj[w].add(v);
    }

}
