
package ejerciciobibliotecalambda;

import logica.NotificadorLibro;


public class EjercicioBibliotecaLambda {

    
    public static void main(String[] args) {
        
        //clasico
        
        NotificadorLibro notif1 = new NotificadorLibro (){
            @Override
            public void enviarNotificacion(String mensaje) {
                System.out.println("Ya tenemos disponibilidad del libro " + mensaje);
            }
            
        };
        notif1.enviarNotificacion("Batallas en el desierto");
        
        //lambda
        
        NotificadorLibro notif2 = mensaje -> System.out.println("Ya tenemos disponibilidad del libro " + mensaje);
        notif2.enviarNotificacion("El Ramayana");
        
        
    }
    
}
