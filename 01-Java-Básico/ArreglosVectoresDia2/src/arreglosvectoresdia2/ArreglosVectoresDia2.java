
package arreglosvectoresdia2;

import java.util.Scanner;


public class ArreglosVectoresDia2 {

    
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        double temperatura []= new double [7];
        int dia=1;
        double suma=0;
        
        System.out.println("Ingrese la temperatura de los ultimos 7 dias: ");
        
        for (int t=0;t<temperatura.length;t++) {
            
            System.out.println("Temperatura dia "+dia+": ");
            dia++;
            
            temperatura[t]= teclado.nextDouble();
            
            suma=suma+temperatura[t];
        }
        
        double promedio = suma/temperatura.length;
                
        System.out.println("La temperatura promedio de la semana fue: "+ promedio);        
        
}        
    
}
