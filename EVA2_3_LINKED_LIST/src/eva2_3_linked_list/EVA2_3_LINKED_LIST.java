/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_3_linked_list;

/**
 *
 * @author Dell
 */
public class EVA2_3_LINKED_LIST {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args){
        Lista lista = new Lista();
        lista.add(100);
        lista.add(200);
        lista.add(300);
        lista.add(400);
        lista.add(500);
        lista.printList();
        System.out.print("");

        System.out.println("Cantidad de nodos: " + lista.size());

        try {
            lista.insertAT(3, 1);
        } catch (Exception e) {
            e.printStackTrace();
        }

        lista.printList();
        System.out.println("Cantidad de nodos: " + lista.size());
        
        

        // *CORRECCIÓN: Ahora findKth se ejecuta antes de borrar la lista*
        try {
            System.out.println("Valor en la posición 2: " + lista.findKth(2));
        } catch (Exception e) {
            System.out.println(e.getMessage() + " aquí está el find en la posición 2");
        }

        lista.clear(); // Ahora se borra la lista
        lista.printList();

        System.out.println("¿Lista vacía? " + lista.isEmpty());
    }
}
