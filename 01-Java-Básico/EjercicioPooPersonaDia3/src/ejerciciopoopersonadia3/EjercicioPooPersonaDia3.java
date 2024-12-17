
package ejerciciopoopersonadia3;

import logica.Persona;


public class EjercicioPooPersonaDia3 {

    public static void main(String[] args) {
        
        //a) Crear un vector de tipo Persona cinco posiciones. Crear cinco personas y guardarlas en él.
        /*variables
            int id;
            String nombre;
            int edad;
            String direccion;
            long telefono;*/
        
        Persona[] person = new Persona[5]; 
        
        person[0] = new Persona(01, "Carlos", 32, "Francisco Villa 1", 55558888);
        person[1] = new Persona(02,"Dafne", 23, "Talisman 45", 55559999);
        person[2] = new Persona(03,"Francisco", 35,"Poetas 104", 55668877);
        person[3] = new Persona(04,"Maria",28,"Balderas 1234",5666897);
        person[4] = new Persona(05,"Mabel", 30,"Siempreviva 777", 33282849);
        
        //b) Recorrer el vector creado y mostrar por pantalla el nombre y edad de cada persona almacenada.

        for (int i = 0; i < person.length; i++) {
            System.out.println("Persona" + (i+1) + ": " + person[i].getNombre() + ", " + person[i].getEdad() + " años"); 
        }
        
        /*c) Cambiar el nombre de dos personas. Mostrar por pantalla el antes, realizar el cambio y luego mostrar el después de los datos de las dos personas 
        cuyos nombres fueron cambiados.*/
        
        System.out.println();
        System.out.println("----DESPUES DEL CAMBIO----");
        System.out.println();
        
        person[1].setNombre("Evelyn");
        person[4].setNombre("Samantha");
        
        for (int i = 0; i < person.length; i++) {
            System.out.println("Persona" + (i+1) + ": " + person[i].getNombre() + ", " + person[i].getEdad() + " años"); 
        }
        
   
    }
    
}
