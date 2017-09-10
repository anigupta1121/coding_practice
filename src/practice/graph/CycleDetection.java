package practice.graph;

import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Stack;

/**
 * Created by guptaanirudh100 on 8/22/2017.
 */

public class CycleDetection {

    static Stack<Integer> stack = new Stack<>();

    public static void main(String[] args) {
        GraphDirected g = new GraphDirected(4);
        g.addEdge(0, 1);
        g.addEdge(0, 2);
        g.addEdge(1, 2);
        g.addEdge(2, 0);
        g.addEdge(2, 3);
        g.addEdge(3, 3);
        LinkedList<Integer> adj[] = g.adj;

        System.out.println(hasCycle(adj, g.v));


    }

    private static boolean hasCycle(LinkedList<Integer> adj[], int V) {

        boolean visited[] = new boolean[V];
        for (int i = 0; i < V; i++) {
            if (cyclicUtils(adj, i, visited))
                return true;
        }

        return false;
    }

    private static boolean cyclicUtils(LinkedList<Integer> adj[], int v, boolean visited[]) {

        visited[v] = true;
        stack.push(v);
        ListIterator<Integer> it = adj[v].listIterator();
        while (it.hasNext()) {
            int n = it.next();
            if (!visited[n] && cyclicUtils(adj, n, visited)) {
                return true;
            } else if (stack.contains(n))
                return true;
        }
        stack.pop();
        return false;


    }







    //geeksforgeeks

    public boolean hasCycle(int v,LinkedList<Integer>[] adj,boolean[] visited,boolean[] explored)
    {

        for (int i = 0; i < v; i++) {
            if (cyclicUtils(adj, i, visited,explored))
                return true;
        }

        return false;

    }

    private static boolean cyclicUtils(LinkedList<Integer> adj[], int v, boolean visited[],boolean explored[]) {

        visited[v] = true;
        explored[v]=true;
        ListIterator<Integer> it = adj[v].listIterator();
        while (it.hasNext()) {
            int n = it.next();
            if (!visited[n] && cyclicUtils(adj, n, visited,explored)) {
                return true;
            } else if (explored[n])
                return true;
        }
        explored[v]=false;
        return false;


    }

}
