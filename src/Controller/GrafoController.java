package Controller;

import Encadena_Multiple.Lista;

public class GrafoController {

    public static void agregarArista(Lista[] adyacencia, int nodoOrigen, int nodoDestino) {
        if (adyacencia[nodoOrigen] == null) {
            adyacencia[nodoOrigen] = new Lista();
        }
        adyacencia[nodoOrigen].agregarNodo(nodoDestino);
    }

    public static void mostrarAdyacencia(Lista[] adyacencia) {
        for (int i = 0; i < adyacencia.length; i++) {
            System.out.print("Nodo " + i + " -> ");
            if (adyacencia[i] != null) {
                adyacencia[i].mostrarLista();
            } else {
                System.out.println();
            }
        }
    }
}
