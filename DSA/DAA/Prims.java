package DSA.DAA;

import java.util.*;

public class Prims {

    static int findMinKey(int key[], boolean mstSet[], int V) {
        int min = Integer.MAX_VALUE, minIndex = -1;

        for (int v = 0; v < V; v++) {
            if (!mstSet[v] && key[v] < min) {
                min = key[v];
                minIndex = v;
            }
        }
        return minIndex;
    }

    static void prims(int graph[][], int V) {
        int parent[] = new int[V];  
        int key[] = new int[V];     
        boolean mstSet[] = new boolean[V];

        Arrays.fill(key, Integer.MAX_VALUE);
        key[0] = 0;           
        parent[0] = -1;       

        for (int count = 0; count < V - 1; count++) {

            int u = findMinKey(key, mstSet, V);
            mstSet[u] = true;

            for (int v = 0; v < V; v++) {
                if (graph[u][v] != 0 && !mstSet[v] && graph[u][v] < key[v]) {
                    parent[v] = u;
                    key[v] = graph[u][v];
                }
            }
        }

        System.out.println("Edges in Minimum Cost Spanning Tree:");
        int minCost = 0;

        for (int i = 1; i < V; i++) {
            System.out.println(parent[i] + " -- " + i + " == " + graph[i][parent[i]]);
            minCost += graph[i][parent[i]];
        }

        System.out.println("Minimum Cost: " + minCost);
    }

    public static void main(String[] args) {

        int graph[][] = {
            { 0, 2, 0, 6, 0 },
            { 2, 0, 3, 8, 5 },
            { 0, 3, 0, 0, 7 },
            { 6, 8, 0, 0, 9 },
            { 0, 5, 7, 9, 0 }
        };

        prims(graph, 5);
    }
}

