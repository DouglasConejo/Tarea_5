package Controller;

import Grafo2.ListaAdyacencia;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ControllerGraf2 {
    private ListaAdyacencia graph;
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));


    public ControllerGraf2() {
    }

    public void createGraph() throws IOException {
        System.out.print("Ingrese el numero de vertices: ");
        int V =Integer.parseInt(reader.readLine());;
        graph = new ListaAdyacencia(V);
    }

    public void addEdge() throws IOException {
        System.out.print("Ingrese la fuente del vértice: ");
        int src = Integer.parseInt(reader.readLine());
        System.out.print("Ingrese la destinación del vértice: ");
        int dest = Integer.parseInt(reader.readLine());
        graph.addEdge(src, dest);
    }

    public void printGraph() {
        graph.printGraph();
    }
}
