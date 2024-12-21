
package ejerciciofrutas;

import java.util.Scanner;
import logica.Fruta;


public class EjercicioFrutas {

    public static void main(String[] args) {
        
        System.out.println("Bienvenido al sistema de la fruteria");
        
        Fruta frut = new Fruta();
        Scanner teclado = new Scanner(System.in);
        
        
        //CARGA DE DATOS
        System.out.println("Ingrese los datos de la fruta a cargar");
        
        System.out.println("Ingrese el nombre de la fruta: ");
        frut.setNombre(teclado.nextLine());
        /*Otra forma de hacerlo 
        String nombreFruta = teclado.nextLine();
        frut.setNombre(nombreFruta);*/
        
        System.out.println("Ingrese el color de la fruta: ");        
        frut.setColor(teclado.nextLine());
        
        System.out.println("Ingrese el tipo de cascara de la fruta: ");        
        frut.setTipoCascara(teclado.nextLine());
        
        System.out.println("Ingrese las calorias cascara de la fruta: ");
        teclado= new Scanner(System.in);
        frut.setCalorias(teclado.nextDouble());
        
        System.out.println("La fruta es comestible? Ingrese 'y' si es comestible, o 'n'en caso contrario: ");
        teclado= new Scanner(System.in);
        frut.setNombre(teclado.nextLine());
        String opcion= teclado.next();
        
        if (opcion.equals("y")){
            frut.setEsComestible(true);
        }
        else {
            frut.setEsComestible(false);
        }
        
        //MOSTRAR DATOS
               
        if (frut.isEsComestible()==true) {
            opcion = "Si";
        }
        else {
            opcion = "No";
        }
        
        System.out.println("La fruta cargada es: " + " Nombre: " + frut.getNombre() + " Color: " + frut.getColor() + 
                " Tipo Cascara: " + frut.getTipoCascara() + " Calorias: "  + frut.getCalorias() + "¿Es comestible? " + opcion);
        
        System.out.println("Cambio a 25 calorias");
        frut.setCalorias(25);
        
        System.out.println("Datos después de modificar");
        
        System.out.println(frut.toString());
        
    }
    
}
