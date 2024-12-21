
package cuentabancaria;

import logica.CuentaBancaria;


public class EjercicioCuentaBancaria {

   
    public static void main(String[] args) {
        
        CuentaBancaria cuenta = new CuentaBancaria("Juan Pérez", 1500.0, 12345);
        
           
            
        System.out.println(cuenta.getTitular());
        System.out.println(cuenta.getSaldo());
        System.out.println(cuenta.getNumeroCuenta());
            
        
    }
    
}
