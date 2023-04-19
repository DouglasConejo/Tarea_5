package Grafo2;

import java.util.LinkedList;

public class ListaAdyacencia {
    private int V;
    private LinkedList<Integer>[] adjList;

    public ListaAdyacencia(int vertices) {
        V = vertices;
        adjList = new LinkedList[V];

        for (int i = 0; i < V; i++) {
            adjList[i] = new LinkedList<>();
        }
    }

    public void addEdge(int src, int dest) {
        adjList[src].add(dest);
        adjList[dest].add(src);
    }

    public void printGraph() {
        for (int i = 0; i < V; i++) {
            System.out.print("Vertex " + i + ":");
            for (Integer v : adjList[i]) {
                System.out.print(" -> " + v);
            }
            System.out.println();
        }
    }
}
