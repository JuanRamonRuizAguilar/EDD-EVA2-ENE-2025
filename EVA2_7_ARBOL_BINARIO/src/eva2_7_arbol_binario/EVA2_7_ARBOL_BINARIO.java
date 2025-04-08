/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_7_arbol_binario;

/**
 *
 * @author Dell
 */
public class EVA2_7_ARBOL_BINARIO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ArbolBi arbolB = new ArbolBi(); // Crear árbol binario

        // Agregar elementos
        arbolB.add(13);
        arbolB.add(10);
        arbolB.add(18);
        arbolB.add(2);
        arbolB.add(11);
        arbolB.add(17);
        arbolB.add(20);
    
        // Recorrido inorden
        System.out.print("Inorder: ");
        arbolB.inorder(); 
    }
}


