
package ejerciciohashmapalumnos;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;


public class EjercicioHashMapAlumnos {

    public static void main(String[] args) {
        
        Map<Integer, Double> promedios = new HashMap<>();
        
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Sistema notas de los Estudiantes\n");
        System.out.println("Ingrese los datos: ");
        
       while (true) {
            System.out.println("------------------------------------------------");          
            System.out.println("Ingrese el número de matrícula del estudiante (0 para salir): ");
            int matricula = teclado.nextInt();
            
            if (matricula == 0) {
                break; 
            }
            
            System.out.print("Ingrese el promedio: ");
            double promedio = teclado.nextDouble();

            
            promedios.put(matricula, promedio);
       
// Búsqueda de datos
        System.out.println("Ingrese el tipo de búsqueda:");
        System.out.println("1. Buscar por matrícula");
        System.out.println("2. Buscar por promedio");
        
        int opcion = teclado.nextInt();
        teclado.nextLine(); // Consumir el salto de línea
        
        if (opcion == 1) {
            System.out.print("Ingrese la matrícula a buscar: ");
            int matriculaBuscada = teclado.nextInt();
            
            if (promedios.containsKey(matriculaBuscada)) {
                System.out.println("Estudiante encontrado: Matrícula: " + matriculaBuscada + ", Promedio: " + promedios.get(matriculaBuscada));
            } else {
                System.out.println("Estudiante no encontrado.");
            }
        } else if (opcion == 2) {
            System.out.print("Ingrese el promedio a buscar: ");
            double promedioBuscado = teclado.nextDouble();
            
            boolean encontrado = false;
            for (Map.Entry<Integer, Double> entry : promedios.entrySet()) {
                if (entry.getValue() == promedioBuscado) {
                    System.out.println("Estudiante encontrado: Matrícula: " + entry.getKey() + ", Promedio: " + promedioBuscado);
                    encontrado = true;
                }
            }
            
            if (!encontrado) {
                System.out.println("Estudiante no encontrado.");
            }
        } 
        else {
            System.out.println("Opción no válida.");
        }
        }
    }
}
