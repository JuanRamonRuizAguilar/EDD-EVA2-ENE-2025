/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_6_stack;

/**
 *
 * @author Dell
 */
public class EVA2_6_stack {

    /**
     * @param args the command line arguments
     */
        public static void main(String[] args) throws Exception {
        Listadoble stack = new ListaDoble();

        stack.push(10);
        stack.push(20);
        stack.push(30);

        stack.imprimirDesdeInicio(); // 10 20 30

        System.out.println("Peek: " + stack.peek()); // 30
        System.out.println("Pop: " + stack.pop());   // 30
        System.out.println("Pop: " + stack.pop());   // 20
        System.out.println("Peek: " + stack.peek()); // 10
    }
public class ListaDoble {
    private Nodo cabeza;
    private Nodo cola;

    private static class Nodo {
        int dato;
        Nodo anterior, siguiente;

        Nodo(int dato) {
            this.dato = dato;
            this.anterior = null;
            this.siguiente = null;
        }
    }

    public void agregarAlFinal(int dato) {
        Nodo nuevo = new Nodo(dato);
        if (cabeza == null) {
            cabeza = cola = nuevo;
        } else {
            cola.siguiente = nuevo;
            nuevo.anterior = cola;
            cola = nuevo;
        }
    }

    public void agregarAlInicio(int dato) {
        Nodo nuevo = new Nodo(dato);
        if (cabeza == null) {
            cabeza = cola = nuevo;
        } else {
            nuevo.siguiente = cabeza;
            cabeza.anterior = nuevo;
            cabeza = nuevo;
        }
    }

    public void eliminar(int dato) {
        Nodo actual = cabeza;
        while (actual != null) {
            if (actual.dato == dato) {
                if (actual.anterior != null) {
                    actual.anterior.siguiente = actual.siguiente;
                } else {
                    cabeza = actual.siguiente;
                }
                if (actual.siguiente != null) {
                    actual.siguiente.anterior = actual.anterior;
                } else {
                    cola = actual.anterior;
                }
                return;
            }
            actual = actual.siguiente;
        }
    }

    public void imprimirDesdeInicio() {
        Nodo actual = cabeza;
        while (actual != null) {
            System.out.print(actual.dato + " ");
            actual = actual.siguiente;
        }
        System.out.println();
    }

    public void imprimirDesdeFinal() {
        Nodo actual = cola;
        while (actual != null) {
            System.out.print(actual.dato + " ");
            actual = actual.anterior;
        }
        System.out.println();
    }
    public int findKth(int k) throws Exception {
    Nodo actual = cabeza;
    int index = 0;

    while (actual != null) {
        if (index == k) {
            return actual.dato;
        }
        actual = actual.siguiente;
        index++;
    }

    throw new Exception("Índice fuera de rango");
}

public void push(int valor){
    agregarAlFinal(valor);
}
public int pop() throws Exception{
    int valor = findKth(0);
    eliminar(0);
    return valor;
}
public int peek()throws Exception{
    int valor = fin.getValor();
    return valor;
}
}
}
