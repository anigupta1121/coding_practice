package beginning;


import java.util.*;

/**
 * Created by guptaanirudh100 on 8/20/2017.
 */
public class GraphBeg {
    public static void main(String[] args) {

        Graph graph = new Graph();
        Scanner p = new Scanner(System.in);
        int n = p.nextInt();
        int m = p.nextInt();

        for (int i = 0; i < m; i++) {
            graph.addEdge(p.nextInt(), p.nextInt());
        }

        int q = p.nextInt();

        while (q > 0) {
            if (graph.hasEddge(p.nextInt(), p.nextInt())) {
                System.out.println("YES");
            } else
                System.out.println("NO");
            q--;
        }


    }
}

class Graph {
    class Vertex {
        int label;
        boolean visited;

        Vertex(int label) {
            this.label = label;
            visited = false;
        }
    }

    ArrayList<Vertex> vertices = new ArrayList<>();
    private HashMap<Integer, Set<Integer>> adj;

    public Graph() {
        adj = new HashMap<>();
    }

    public void addEdge(int v1, int v2) {
        if (!adj.containsKey(v1)) {
            Set<Integer> set = new TreeSet<>();
            Set<Integer> set2 = new TreeSet<>();
            set.add(v2);
            adj.put(v1, set);
            set2.add(v1);
            adj.put(v2, set2);
        } else {
            Set<Integer> set = adj.get(v1);
            Set<Integer> set2 = adj.get(v2);

            if (set == null)
                set = new TreeSet<>();

            set.add(v2);
            adj.put(v1, set);
            if (set2 == null)
                set2 = new TreeSet<>();

            set2.add(v1);

            adj.put(v2, set2);

        }
    }

    public void addVertex(char label) {
        Vertex vertex = new Vertex(label);
        vertices.add(vertex);
    }

    public boolean hasEddge(int v1, int v2) {

        Set<Integer> set1 = adj.get(v1);
        Set<Integer> set2 = adj.get(v2);
        if (set1 != null) {
            return set1.contains(v2);
        }

        if (set2 != null) {
            return set2.contains(v2);
        }
        return false;
    }

}


