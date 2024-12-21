package ejercicioherenciaypolimorfismosalario;

import logica.Empleado;
import logica.EmpleadoDependencia;
import logica.EmpleadoPorHora;

public class EjercicioHerenciaYPolimorfismoSalario {

    public static void main(String[] args) {
        
        Empleado[] empleados = new Empleado[5];

        empleados[0] = new EmpleadoDependencia(1000, "Juan", 15000);
        empleados[1] = new EmpleadoPorHora(50, 300, "Maria", 0);
        empleados[2] = new EmpleadoDependencia(1200, "Brenda", 17000);
        empleados[3] = new EmpleadoPorHora(48, 335, "Lucero", 0);
        empleados[4] = new EmpleadoDependencia(2000, "Gerardo", 18000);

        
        for (int i = 0; i < empleados.length; i++) {
            System.out.println("Nombre: " + empleados[i].getNombre());
            System.out.println("Salario: " + empleados[i].calcularSalario());
            System.out.println("Descripción: " + empleados[i].getDescripcion());
            System.out.println("-------------------------------");
        }
    }
}
