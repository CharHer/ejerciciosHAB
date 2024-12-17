
package herenciapolimorfismovestimentadia5;

import logica.Camiseta;
import logica.Pantalon;
import logica.Sombrero;
import logica.Vestimenta;
import logica.Zapato;

public class HerenciaPolimorfismoVestimentaDia5 {

    public static void main(String[] args) {
        
        Vestimenta[] vestimenta = new Vestimenta [9];
        
        vestimenta[0] = new Zapato("Cuero", "Agujetas", 123, "Charol", 1500.00, "Michel Domit", 27.5, "Negro");
        vestimenta[1] = new Zapato("Espuma", "Velcro", 456, "Air", 1000.99, "Bubble Gummers", 16, "Verde");
        vestimenta[2] = new Zapato("Tela", "Elastico", 789, "Extreme Confort", 1999.99, "Skechers", 25, "Gris");
        vestimenta[3] = new Pantalon("Recto", "Lino", 321, "Caminata", 1200, "Decathlon", 28, "Acero");
        vestimenta[4] = new Pantalon("Slim", "Mezclilla", 654, "Superduper", 1300.50, "Levis", 0, "Azul");
        vestimenta[5] = new Pantalon("Pants", "Algodon", 987, "Sports", 650, "Puma", 30, "Azul marino");
        vestimenta[6] = new Camiseta("Corta", "Redondo", 147, "Fresca", 250, "C&A", 14, "Blanco");
        vestimenta[7] = new Camiseta ("Larga", "En uve", 258, "Cool", 700.25, "Decathlon", 20, "Azul rey");
        vestimenta[8] = new Sombrero("Desierto", 'M', 369, "Desert", 400, "Columbia Sportswear", 25, "Camuflaje arena");
        
        for (int i = 0; i < vestimenta.length ; i++) {
            vestimenta[i].mostrarInfo();
            
        }
        
    }   
    
}
