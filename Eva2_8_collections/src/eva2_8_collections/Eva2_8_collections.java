/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_8_collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Map;
import java.util.Stack;

/**
 *
 * @author Dell
 */
public class Eva2_8_collections {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("");

        LinkedList<Integer> miLista = new LinkedList<Integer>();
        miLista.add(100);
        miLista.add(200);
        miLista.add(300);
        miLista.add(400);
        miLista.add(500);
        miLista.add(600);
        System.out.println(miLista);

        miLista.remove(3);  // Elimina el elemento en la posición 3 (índice)
        System.out.println(miLista);

        miLista.add(2, 9999999);  // Inserta en el índice 2 el valor 9999999
        System.out.println(miLista);

        System.out.println("ARRAYLIST");
        ArrayList<String> miArrayList = new ArrayList<String>();
        miArrayList.add("Hola");
        miArrayList.add(" ");
        miArrayList.add("Mundo");
        miArrayList.add(" ");
        miArrayList.add("Cruel");
        miArrayList.add("!!!!");
        System.out.println(miArrayList);
        
        
        System.out.println("stack");
        Stack<Integer> stack = new Stack();
        stack.push(100);
        stack.push(200);
        stack.push(300);
        stack.push(400);
        stack.push(500);
        System.out.println("cima" + stack.peek());
        System.out.println(stack);
        System.out.println("cima"+ stack.pop());
        System.out.println(stack);
        
       HashSet<String> conjunto = new HashSet();
               conjunto.add("rojo");
               conjunto.add("azul");
               conjunto.add("verde");
               conjunto.add("amarillo");
               conjunto.add("amarillo");
               System.out.println(conjunto);
               
               Map<String, Integer> mapa= new HashMap();
               mapa.put("lunes", 1);
               mapa.put("martes", 2);
               mapa.put("miercoles", 3);
               mapa.put("jueves", 4);
               mapa.put("viernes", 5);
               mapa.put("sabado", 6);
               System.out.println(mapa.get("lunes"));
               System.out.println(mapa);

    }
    

}


