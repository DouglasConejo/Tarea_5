package Encadena_Multiple;

public class Nodo {
    private int id;
    private Nodo siguiente;

    public Nodo(int id) {
        this.id = id;
        this.siguiente = null;
    }

    public int getId() {
        return id;
    }

    public Nodo getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(Nodo siguiente) {
        this.siguiente = siguiente;
    }
}
