/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eva2_3_linked_list;

/**
 *
 * @author Dell
 */
public class Nodo {
    private int valor;
    private Nodo siguiente;

public Nodo(){
    siguiente = null;
    
}

    public Nodo(int valor) {
        this.valor = valor;
    }
    
    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public Nodo getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(Nodo siguiente) {
        this.siguiente = siguiente;
    }

    public Nodo(int valor, Nodo siguiente) {
        this.valor = valor;
        this.siguiente = siguiente;
    }
}
