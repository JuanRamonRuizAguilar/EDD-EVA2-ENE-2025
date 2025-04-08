/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eva2_3_linked_list;

/**
 *
 * @author Dell
 */
public class Lista {
    private Nodo inicio;
    private Nodo fin;
    private int nuevoValor;
    private int[] valores;

    public Lista() {
        inicio = null;
        fin = null;
    }

    public void add(int valor) {
        Nodo nuevo = new Nodo(valor);
        if (inicio == null) {
            inicio = nuevo;
            fin = nuevo;  // Ahora fin también apunta al primer nodo
        } else {
            fin.setSiguiente(nuevo); // Se enlaza el último nodo con el nuevo
            fin = nuevo; // Se actualiza fin
        }
    }

    public void printList() {
        Nodo temp = inicio;
        while (temp != null) {
            System.out.println("{" + temp.getValor() + "}");
            temp = temp.getSiguiente();
        }
    }

    public void insertAT(int valor, int posicion) throws Exception {
        if (posicion < 0 || posicion > size()) {
            throw new Exception("La posición " + posicion + " no es válida, debe estar entre 0 y " + size());
        }

        Nodo nuevo = new Nodo(valor);

        if (posicion == 0) { // Insertar al inicio
            nuevo.setSiguiente(inicio);
            inicio = nuevo;
            if (fin == null) { // Si la lista estaba vacía
                fin = nuevo;
            }
            return;
        }

        Nodo temp = inicio;
        int cont = 0;

        while (cont < posicion - 1) {
            temp = temp.getSiguiente();
            cont++;
        }

        nuevo.setSiguiente(temp.getSiguiente());
        temp.setSiguiente(nuevo);

        if (nuevo.getSiguiente() == null) { // Si el nuevo nodo es el último, actualizar fin
            fin = nuevo;
        }
    }

    public int size() {
        Nodo temp = inicio;
        int contador = 0;

        while (temp != null) {
            contador++;
            temp = temp.getSiguiente();
        }
        return contador;
    }

    public void clear() {
        inicio = null;
        fin = null;
    }
    public boolean isEmpty(){
        return inicio ==null;
    
    }
    public void eliminarNodo(int posicion){
        if(inicio == null){
            System.out.println("la lista esta vacia");
            return;
        
        }
    if(posicion==0){
    inicio =inicio.getSiguiente();
    return;
    }
    Nodo actual = inicio;
    Nodo anterior = null;
    int contador=0;
    
     while(actual != null && contador<posicion){
         anterior = actual;
         actual = actual.getSiguiente();
         contador++;
    }
   


}
    
    public int findKth(int posicion) throws Exception {
    if (posicion < 0 || posicion >= size()) { // CORRECCIÓN: debe ser >= size()
        throw new Exception("La posición " + posicion + " no es válida, debe estar entre 0 y " + (size() - 1));
    }

    Nodo temp = inicio;
    int cont = 0;

    while (cont < posicion) { // CORRECCIÓN: Se recorre hasta la posición correcta
        temp = temp.getSiguiente();
        cont++;
    }

    return temp.getValor();
}
}
