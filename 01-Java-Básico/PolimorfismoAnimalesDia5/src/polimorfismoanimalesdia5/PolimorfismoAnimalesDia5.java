
package polimorfismoanimalesdia5;

import logica.Animal;
import logica.Ave;
import logica.Mamifero;
import logica.Reptil;


public class PolimorfismoAnimalesDia5 {

    public static void main(String[] args) {
        
        //c) En el método "main", crear un objeto de cada clase hija. Llamar a los 3 métodos saludar desde cada objeto.
        
        Mamifero mamifero = new Mamifero();
        Ave ave = new Ave();
        Reptil reptil = new Reptil();
  
        mamifero.saludar();
        ave.saludar();
        reptil.saludar();
        
        //d) Crear un objeto de tipo animal e intentar asignarle al Mamífero creado… ¿Qué sucede? ¿Es posible hacer esto? ¿Se aplica alguna propiedad para esto?
        
        Animal animal = new Animal();
        animal = mamifero;
        
        
        
    }
    
}
