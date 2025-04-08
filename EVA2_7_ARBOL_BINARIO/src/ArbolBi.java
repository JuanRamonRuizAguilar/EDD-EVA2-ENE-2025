/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Dell
 */
public class ArbolBi {
    private Nodo root;

    public ArbolBi() {
        root = null;
    }

    public void add(int valor) {
        root = addRec(valor, root);
    }

    private Nodo addRec(int valor, Nodo actual) {
        if (actual == null) {
            return new Nodo(valor);
        }
        if (valor < actual.getValor()) {
            actual.setIzquierda(addRec(valor, actual.getIzquierda()));
        } else if (valor > actual.getValor()) {
            actual.setDerecha(addRec(valor, actual.getDerecha()));
        }
        return actual;
    }

    public void inorder() {
        inorderRec(root);
        System.out.println("");
    }

    private void inorderRec(Nodo actual) {
        if (actual != null) {
            inorderRec(actual.getIzquierda());
            System.out.print("[" + actual.getValor() + "] ");
            inorderRec(actual.getDerecha());
        }
    }
}
