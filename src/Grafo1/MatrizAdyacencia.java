package Grafo1;

public class MatrizAdyacencia {
    private int[][] matrizAdyacencia;

    // Constructor
    public MatrizAdyacencia(int numVertices) {
        matrizAdyacencia = new int[numVertices][numVertices];
    }

    // Método para agregar un arco desde el vértice i al vértice j
    public void agregarArco(int i, int j) {
        matrizAdyacencia[i][j] = 1;
        matrizAdyacencia[j][i] = 1; // Ya que la matriz de adyacencia es simétrica
    }

    // Método para mostrar la matriz de adyacencia
    public void mostrarMatriz() {
        for (int i = 0; i < matrizAdyacencia.length; i++) {
            for (int j = 0; j < matrizAdyacencia[i].length; j++) {
                System.out.print(matrizAdyacencia[i][j] + " ");
            }
            System.out.println();
        }
    }
}
