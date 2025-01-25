
package ejemplointerfazfuncional;

import logica.Mensajero;


public class EjemploInterfazFuncional {

   
    public static void main(String[] args) {
        
        //mediante clases anonimas
        Mensajero mensaje = new Mensajero() {
           
            @Override
            public void emitirMensaje(String nombre) {
                System.out.println("Hola " + nombre + " desde clase anonima");
            }

        };
        
        mensaje.emitirMensaje("Carlos");
        
        //lamdas              no es necesario abrir llaves, pero en buena practica
        Mensajero mensajeLamda = (nombre)-> {System.out.println("Hola " + nombre + " desde Lambda");};
        mensajeLamda.emitirMensaje("Luisina");
        
    }
    
}
