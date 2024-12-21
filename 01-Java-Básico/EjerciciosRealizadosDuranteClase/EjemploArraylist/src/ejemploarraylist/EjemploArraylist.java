
package ejemploarraylist;

import java.util.ArrayList;
import logica.Fruta;


public class EjemploArraylist {

    
    public static void main(String[] args) {
        
        ArrayList<Fruta> listaFrutas = new ArrayList<Fruta>();
        
        //una forma de cargar
        Fruta fruta = new Fruta("Manzana", "Roja", "Todo el anio");
        listaFrutas.add(fruta);
        
        //otra forma mas eficiente
        listaFrutas.add(new Fruta("Naranja", "Anaranjado", "Todo el anio"));
        listaFrutas.add(new Fruta("Banana", "Amarillo", "Todo el anio"));
        listaFrutas.add(new Fruta("Sandia", "Verde", "Verano"));
    
        //Traer elemento de un indice en particular
        Fruta frut = listaFrutas.get(3);
        
        //eliminar un elemento
        listaFrutas.add(new Fruta("Melon", "Azul", "Verano"));
        listaFrutas.remove(4);
        
        //obtener tamanio de la lista
        int tamanio = listaFrutas.size();
        
        //recorrido mediante indices
            for (int i=0; i<listaFrutas.size();i++) {
            System.out.println("Fruta: " + listaFrutas.get(i).getNombre());
        }                               //asigna un elemento de la lista y metodo para traer su nombre 
        
        //recorrer con el for each (no puedo usar la misma variable que ya habiamos usado [frut])
        for(Fruta fru:listaFrutas) {
            System.out.println("Fruta: "+ fru.getNombre());
        }
        
        
    }
    
}
