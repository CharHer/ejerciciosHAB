
package ejerciciolibros;

import java.util.Scanner;
import logica.Libros;


public class EjercicioLibros {

    
    public static void main(String[] args) {
        
        Libros libro = new Libros();
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("---Datos de libros---");
        
        System.out.println("Ingrese el codigo ISBN: ");
        libro.setCodigoISBN(teclado.nextInt());
        
        System.out.println("Ingrese el numero de paginas: ");
        libro.setPags(teclado.nextInt());
        
        System.out.println("Ingrese el titulo del libro: ");
        teclado=new Scanner(System.in);
        libro.setTitulo(teclado.nextLine());
        
        System.out.println("Ingrese el nombre del autor: ");
        libro.setAutor(teclado.nextLine());
        
        System.out.println("Ingrese el genero del libro: ");
        libro.setGenero(teclado.nextLine());
        
        System.out.println(libro.toString());
        
        System.out.println("-------------------------");
        System.out.println("Se actualizo el num. de pags. a 220");
        libro.setPags(220);
        System.out.println("El codigo ISBN es " + libro.getCodigoISBN() + " El numero de paginas es " + libro.getPags() + " El titulo es " + libro.getTitulo());       
       
    }
    
}
