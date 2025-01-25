
package ejemplorefmetodoinstancia;

import logica.Persona;


public class EjemploRefMetodoInstancia {

    
    public static void main(String[] args) {
        
        Persona pers = new Persona();
        pers.setNombre("Luisina");
        
        //usar referencia a metodos
        //necesitas usar una interfaz funcional
        
        Runnable saludo = pers::saludar;
        saludo.run();
        
        //forma normal
        pers.saludar();
        
    }
    
}
