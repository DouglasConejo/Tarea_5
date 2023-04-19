package Encadena_Multiple;

public class Lista {
    private Nodo primero;

    public Lista() {
        primero = null;
    }

    public void agregarNodo(int id) {
        Nodo nuevoNodo = new Nodo(id);
        if (primero == null) {
            primero = nuevoNodo;
        } else {
            Nodo ultimo = primero;
            while (ultimo.getSiguiente() != null) {
                ultimo = ultimo.getSiguiente();
            }
            ultimo.setSiguiente(nuevoNodo);
        }
    }

    public void mostrarLista() {
        Nodo actual = primero;
        while (actual != null) {
            System.out.print(actual.getId() + " ");
            actual = actual.getSiguiente();
        }
        System.out.println();
    }
}
