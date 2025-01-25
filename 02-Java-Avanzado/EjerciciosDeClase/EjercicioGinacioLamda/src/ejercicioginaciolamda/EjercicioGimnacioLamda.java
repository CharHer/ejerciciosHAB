
package ejercicioginaciolamda;

import logica.NotificadorClase;


public class EjercicioGimnacioLamda {

    
    public static void main(String[] args) {
        
        //mediante clases anonimas
        NotificadorClase notif = new NotificadorClase (){
            @Override
            public void enviarRecordatorio(String msje) {
                System.out.println("Recuerde que tiene clases de "+msje);
            }
        
        };
        notif.enviarRecordatorio("Zumba");
        
        //mediante lambdas
        
        //paramentro + funcion flecha + sentencia
        NotificadorClase notif2 = (mensaje)->System.out.println("Recuerde que tiene clases de: " + mensaje);
        notif2.enviarRecordatorio("Pilates");
        
        
    }
    
}
