
package ejemplolinkedlist;

import java.util.LinkedList;

public class EjemploLinkedList {

    public static void main(String[] args) {
        
        LinkedList<String> listaFrutas = new LinkedList<String>();
        
        //Java agrega los elementos en el orden que yo especifique
        //El ultimo que entra es el ultimo en la lista (LIFO Y FIFO)
        
        listaFrutas.add("Naranja");
        listaFrutas.add("Manzana");
        listaFrutas.add("Banana");
        listaFrutas.add("Fresa");
        
        //Se agrega un indice para establecer el lugar que ocupara
        listaFrutas.add(0,"Melon");
        
        //para ver el tama;o de una lista
        int tamanio = listaFrutas.size();
        System.out.println("El tamanio de la lista es: " + tamanio);
        
        
        //recorrer la linkedlist (Usamos el for each)
        for (String fruta: listaFrutas) {
            System.out.println("La fruta guardada es: " + fruta);
        }
        
        //borrar elemento por posicion
        listaFrutas.remove(0);        
    }
    
}
