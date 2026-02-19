package DSA.DAA;
import java.util.*;
class Edge implements Comparable<Edge> {
    int src, dest, weight;
    Edge(int s, int d, int w) {
        src = s;
        dest = d;
        weight = w;
    }
public int compareTo(Edge other) {
        return this.weight - other.weight;
    }
}
class Subset {
    int parent, rank;
}
public class KruskalMST {
    static int find(Subset[] subsets, int i) {
        if (subsets[i].parent != i)
            subsets[i].parent = find(subsets, subsets[i].parent);
        return subsets[i].parent;
    }
     static void union(Subset[] subsets, int x, int y) {
        int xroot = find(subsets, x);
        int yroot = find(subsets, y);

        if (subsets[xroot].rank < subsets[yroot].rank)
            subsets[xroot].parent = yroot;
        else if (subsets[xroot].rank > subsets[yroot].rank)
            subsets[yroot].parent = xroot;
        else {
            subsets[yroot].parent = xroot;
            subsets[xroot].rank++;
        }
    }
     static void kruskalMST(int V, Edge[] edges) {

        Arrays.sort(edges);

        Subset[] subsets = new Subset[V];
        for (int i = 0; i < V; i++) {
            subsets[i] = new Subset();
            subsets[i].parent = i;
            subsets[i].rank = 0;
        }

       

 ArrayList<Edge> result = new ArrayList<>();
       for (Edge e : edges) {
            int x = find(subsets, e.src);
            int y = find(subsets, e.dest);
          if (x != y) {
                result.add(e);
                union(subsets, x, y);
            }
        }
      System.out.println("Edges in the Minimum Cost Spanning Tree:");
        int minCost = 0;
        for (Edge e : result) {
            System.out.println(e.src + " -- " + e.dest + " == " + e.weight);
            minCost += e.weight;
        }
        System.out.println("Minimum Cost: " + minCost);
    }
   public static void main(String[] args) {
         int V = 4;
        Edge[] edges = {
                new Edge(0, 1, 10),
                new Edge(0, 2, 6),
                new Edge(0, 3, 5),
                new Edge(1, 3, 15),
                new Edge(2, 3, 4)
        };
       kruskalMST(V, edges);
    }
}