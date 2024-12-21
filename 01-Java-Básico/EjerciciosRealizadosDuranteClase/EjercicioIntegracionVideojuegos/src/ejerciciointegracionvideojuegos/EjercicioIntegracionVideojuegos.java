
package ejerciciointegracionvideojuegos;

import java.util.Scanner;
import logica.Videojuego;

public class EjercicioIntegracionVideojuegos {

    public static void main(String[] args) {
        
        // Crear un vector de tipo VideoJuego que pueda almacenar 5 videojuegos. Crear 5 videojuegos y guardarlos en el vector.
        //VAR. String codigo, String titulo, String consola, int cantidadJugadores
                        
        Videojuego[] game = new Videojuego[5];
        
        /*EN CASO DE CREAR EL VECTOR
        game[0] = new Videojuego("A01", "The legend of Zelda", "N64", 152);
        game[1] = new Videojuego("A02", "Nier Automata", "Xbox", 423);
        game[2] = new Videojuego("A03", "Ghost of Thushima", "PS5", 200);
        game[3] = new Videojuego("A04", "Turok", "N64", 57);
        game[4] = new Videojuego("A05", "League of Legends", "PC", 789);*/
        
        Scanner teclado = new Scanner(System.in);
        
        for (int i = 0; i < game.length; i++) {
            System.out.println("Ingrese los datos del videojuego " + (i + 1));
            
            System.out.print("Código: ");
            String codigo = teclado.nextLine();
            
            System.out.print("Título: ");
            String titulo = teclado.nextLine();
            
            System.out.print("Consola: ");
            String consola = teclado.nextLine();
            
            System.out.print("Cantidad de jugadores: ");
            int cantidadJugadores = teclado.nextInt(); 
            teclado.nextLine();

            game[i] = new Videojuego(codigo, titulo, consola, cantidadJugadores);
        }
                
        //Recorrer el vector creado y mostrar por pantalla el titulo, consola y cantidad de jugadores de los videojuegos almacenados
        
        for (int i = 0; i < game.length; i++) {
            System.out.println("Videojuego " + (i+1) + " Titulo: " + game[i].getTitulo() + " , Consola: " + game[i].getConsola() + ", No. de jugadores: "+ 
                    game[i].getCantidadJugadores()); 
        } 
        
        //Cambiar el nombre y la cantidad de jugadores de dos videojuegos. Mostrar por pantalla los datos de todos los videojuegos luego del cambio.
        
        System.out.println();
        System.out.println("----DESPUES DEL CAMBIO----");
        System.out.println();
        
        
        game[1].setTitulo("Halo");
        game[1].setCantidadJugadores(541);
        game[4].setTitulo("Apex legends");
        game[4].setCantidadJugadores(324);
        
        for (int i = 0; i < game.length; i++) {
            System.out.println("Videojuego " + (i+1) + " Titulo: " + game[i].getTitulo() + " , Consola: " + game[i].getConsola() + ", No. de jugadores: " + 
                    game[i].getCantidadJugadores()); 
        } 
        
        /*Recorrer el vector y mostrar por pantalla únicamente a los videojuegos que sean de la consola “Nintendo 64”. 
        En caso que no encuentre ninguno, informarlo también por pantalla.*/
        
        System.out.println("\n---- Videojuegos en la consola 'Nintendo 64' ----\n");
        boolean encontrado = false;
        
        for (int i = 0; i < game.length; i++) {
            if (game[i].getConsola().equalsIgnoreCase("N64")) { 
                System.out.println("Videojuego " + (i + 1) + " Titulo: " + game[i].getTitulo() + " , Consola: " + game[i].getConsola() + ", No. de jugadores: " +
                        game[i].getCantidadJugadores());
                encontrado = true; 
            }
        }
        
        if (!encontrado) {
            System.out.println("No hay registros para N64");
        }
    }
}
    

