
package ejerciciomatricesteatro;

import java.util.Scanner;


public class EjercicioMatricesTeatro {

    public static void main(String[] args) {
        
        //DECLARACION DE VARIABLES
        String asientos [][] = new String[5][5];
        boolean bandera = false;
        int fila=0, columna=0;
        String respuesta;
        String verMapa;
        Scanner teclado = new Scanner(System.in);
        
        //CARGA DE MATRIZ DE ASIENTOS
        for (int f=0; f<asientos.length; f++) {
            for (int c=0; c<asientos[f].length; c++) {
                asientos[f][c]= "[O]";

            }

        }

        System.out.println("-----Bienvenido al sistema de compra de boletos-----\n");
        
        //RESERVA DE ASIENTOS
        while(bandera!=true){
            //visualizacion de mapa
            System.out.println("Desea ver asientos disponibles? (Presione S para SI o cualquier tecla para NO");
            verMapa = teclado.next();
            
            if(verMapa.equalsIgnoreCase("S")) {
                dibujarMapa(asientos);
             }
            
            //reserva
            boolean estaOk = false;
            
            while(estaOk!=true){
            System.out.println("\nSeleccione fila y columna para reservar:");
            
            System.out.print("Fila (entre 0 y 4): ");
                fila=teclado.nextInt();
            System.out.print("Columna (entre 0 y 4): ");
                columna=teclado.nextInt();
                
                if (fila<=4 && fila>=0){
                    if (columna<=4 && columna>=0){
                        estaOk = true;
                    }
                    else {
                        System.out.println("El numero de columa no es valido");
                    } 
                }   
                    else {
                        System.out.println("El numero de fila no es valido");
                    }    
                }
            
            if (asientos[fila][columna].equals("[O]")){
                
                asientos[fila][columna] = "[X]";
                System.out.println("\nAsiento reservado correctamente");
                                
            }
            else{
                System.out.println("El asiento esta ocupado. Por favor seleccione uno diferente");
            }   
                
            System.out.println("\nDesea continuar la compra de asientos? (Presione S para SI o cualquier tecla para NO)");
            respuesta = teclado.next();
            
            if(respuesta.equalsIgnoreCase("S")){
                bandera = false;
            }
            else {
                bandera = true;
            }
            
        }
 
    }
    
    static void dibujarMapa (String asientos [][]) {
        
        for (int f=0; f<asientos.length; f++) {
            System.out.print(f + "| "); //NUMERAR LAS FILAS
            for (int c=0; c<asientos[f].length; c++) {
                
                System.out.print(asientos[f][c] + " ");    
            }
            System.out.println("");
        }
        System.out.println("\n     (ESCENARIO)    ");
        System.out.println("**********************\n");
        
        
    }
    
}
