/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_9_tipo_genericos;

/**
 *
 * @author Dell
 */
public class EVA2_9_TIPO_GENERICOS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Nodo<String> nodo = new Nodo();
        nodo.setValor("hola mudnoo");
        System.out.println(nodo.getValor());
        Nodo <Double> nodo2 = new Nodo();
        nodo2.setValor(1000.8);
        System.out.println(nodo2.getValor());
    }
    
    static class Nodo<T>{
        private T valor;
        private Nodo siguiente;
        private Nodo previo;
        
        public Nodo(){
            siguiente = null;
            previo = null;
        }
        
        // Getter y Setter para valor
        public T getValor() {
            return valor;
        }
        
        public void setValor(T valor) {
            this.valor = valor;
        }
        
        // Getter y Setter para siguiente
        public Nodo getSiguiente() {
            return siguiente;
        }
        
        public void setSiguiente(Nodo siguiente) {
            this.siguiente = siguiente;
        }
        
        // Getter y Setter para previo
        public Nodo getPrevio() {
            return previo;
        }
        
        public void setPrevio(Nodo previo) {
            this.previo = previo;
        }
    }
}
