import Controller.ControllerGraf1;
import Controller.ControllerGraf2;
import Controller.GrafoController;
import Encadena_Multiple.Lista;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ControllerGraf1 controlador = new ControllerGraf1(8);
        ControllerGraf2 controlador2 = new ControllerGraf2( );


        System.out.println("Bienvenido al menú");
        System.out.println("1. Matriz de Adyacencia");
        System.out.println("2. Lista de Adyacencia 2");
        System.out.println("3. Lista encadenada múltiple de adyacencia");
        System.out.println("4. Salir");

        int choice = Integer.parseInt(reader.readLine());

        switch (choice) {
            case 1:
                System.out.println("1. Agregar Matriz de Adyacencia");
                System.out.println("2. Mostrar Matriz de Adyacencia");

                int choice2 = Integer.parseInt(reader.readLine());
                switch (choice) {
                    case 1:
                        // Pedir al usuario que ingrese los arcos del grafo
                        System.out.println("Ingrese los arcos del grafo (en formato i j):");
                        String linea;
                        while ((linea = reader.readLine()) != null) {
                            String[] partes = linea.trim().split(" ");
                            int i = Integer.parseInt(partes[0]);
                            int j = Integer.parseInt(partes[1]);
                            controlador.agregarArco(i, j);
                        }
                        break;
                    case 2:
                        controlador.mostrarMatriz();
                        System.out.println("Matriz de adyacencia del grafo mostrada en la consola.");
                        break;
                }
                break;
            case 2:
                System.out.println("1. Agregar borde");
                System.out.println("2. Imprimir gráfico");
                System.out.println("Escoja la opción");

                int choice3 = Integer.parseInt(reader.readLine());
                switch (choice3) {
                    case 1:
                        controlador2.addEdge();

                        break;
                    case 2:
                        controlador2.printGraph();
                        break;
                }
            case 3:
                System.out.println("1. Agregar Grafo");
                System.out.println("2. Mostrar Grafo");
                System.out.println("Escoja la opción");

                int choice4 = Integer.parseInt(reader.readLine());
                switch (choice4) {
                    case 1:
                        System.out.print("Ingrese el número de nodos del grafo: ");
                        int numNodos = Integer.parseInt(reader.readLine());

                        Lista[] adyacencia = new Lista[numNodos];
                        System.out.print("Ingrese las aristas del grafo (en formato nodo Origen a nodo Destino): ");
                        String[] aristas = reader.readLine().split(" ");
                        while (!aristas[0].equals("fin")) {
                            int nodoOrigen = Integer.parseInt(aristas[0]);
                            int nodoDestino = Integer.parseInt(aristas[1]);
                            GrafoController.agregarArista(adyacencia, nodoOrigen, nodoDestino);
                            aristas = reader.readLine().split(" ");
                        }
                        break;
                    case 2:
                       GrafoController.mostrarAdyacencia(adyacencia);
                        break;
                }                break;
            case 4:
                // Salir del programa
                System.exit(0);
                break;
            default:
                System.out.println("Opción inválida. Por favor, seleccione una opción válida.");
                break;
        }
    }
}