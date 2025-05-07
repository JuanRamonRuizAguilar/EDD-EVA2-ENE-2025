/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_2_referencias;

/**
 *
 * @author Dell
 */
public class EVA2_2_REFERENCIAS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Ejmeplo obj1 = new Ejmeplo();
        obj1.valor = 100;
        obj1.siguiente = new Ejmeplo();
        obj1.siguiente.valor = 200;
        obj1.siguiente.siguiente = new Ejmeplo();
        obj1.siguiente.siguiente.valor = 300;
        obj1.siguiente.siguiente.siguiente = null;
        
        Ejemplo temp = obj1;
        while(temp !=null ){
            System.out.println("[" + temp.valor + "]");
            temp = temp.siguiente;
        }
            
        
    }
    
}
class Ejemplo{
    int valor;
    Ejemplo siguiente;
    
}
        
