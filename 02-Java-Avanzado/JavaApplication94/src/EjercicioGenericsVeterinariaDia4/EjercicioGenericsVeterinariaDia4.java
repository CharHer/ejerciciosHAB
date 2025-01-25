
package EjercicioGenericsVeterinariaDia4;

import logica.Mascota;
import logica.RegistroMascotas;


public class EjercicioGenericsVeterinariaDia4 {

    
    public static void main(String[] args) {
        
        RegistroMascotas registro = new RegistroMascotas(); 
        
        
        registro.generarMascotasAleatorias(5);

        
        registro.agregarMascota(new Mascota<>("MASC101", "Firulais", 3, "Perro"));

        
        System.out.println("Mascotas con nombre 'Luna': " + registro.buscarPorNombre("Luna"));

        
        System.out.println("Mascotas de especie 'Perro': " + registro.buscarPorEspecie("Perro"));

        
        System.out.println("Total de mascotas registradas: " + registro.contarMascotas());
    }
    
}