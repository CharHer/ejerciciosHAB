
package ejercicioabseinterdia6;

import java.util.ArrayList;
import logica.Auto;
import logica.Camioneta;
import logica.Moto;
import logica.Vehiculo;

public class EjercicioAbsEInterDia6 {

    public static void main(String[] args) {
        
        ArrayList<Vehiculo> listaVehiculos = new ArrayList<Vehiculo>();
        
        /*Auto auto1 = new Auto(125000, 8, 123456, "AM07-56", 2015, 2024, 150000);
        Moto moto1 = new Moto(150, "pequeno", 15687, "M01-50", 2010, 2024, 75000);
        Camioneta camioneta1 = new Camioneta(100, 10, 546843, "CA85-47", 2020, 2024, 350000);
        Auto auto2 = new Auto(125000, 8, 123456, "AM07-56", 2015, 2024, 150000);
        Moto moto2 = new Moto(300, "Mediano", 136584, "M05-12", 2022, 2024, 125000);
        Camioneta camioneta2 = new Camioneta(150, 15, 154214, "CA87-99", 2000, 2024, 300000);*/
        
        listaVehiculos.add(new Auto(125000, 8, 123456, "AM07-56", 2015, 2024, 150000));
        listaVehiculos.add(new Moto(150, "pequeno", 15687, "M01-50", 2010, 2024, 75000));
        listaVehiculos.add(new Camioneta(100, 10, 546843, "CA85-47", 2020, 2024, 350000));
        listaVehiculos.add(new Auto(125000, 8, 123456, "AM07-56", 2015, 2024, 150000));
        listaVehiculos.add(new Moto(300, "Mediano", 136584, "M05-12", 2022, 2024, 125000));
        listaVehiculos.add(new Camioneta(150, 15, 154214, "CA87-99", 2000, 2024, 300000));
        
        for (Vehiculo v : listaVehiculos) {
            System.out.println(v.toString());
            System.out.println("Antigüedad: " + v.calcularAntiguedad() + " años");
            System.out.println("-------------------------------");
                    
        }
        
    }
    
}
