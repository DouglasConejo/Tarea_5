package Controller;

import Grafo1.MatrizAdyacencia;

public class ControllerGraf1 {
    private MatrizAdyacencia matriz;

    public ControllerGraf1(int numVertices) {
        matriz = new MatrizAdyacencia(numVertices);
    }
    public void agregarArco(int i, int j) {
        matriz.agregarArco(i, j);
    }
    public void mostrarMatriz() {
        System.out.println("Matriz de adyacencia del grafo:");
        matriz.mostrarMatriz( );
    }
}
