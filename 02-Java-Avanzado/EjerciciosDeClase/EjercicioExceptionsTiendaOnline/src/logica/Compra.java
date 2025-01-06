
package logica;

import java.util.Scanner;

public class Compra {
    
    String numeroTarjeta;
    double montoCompra;    
    String nombreCliente;

    public Compra() {
    }

    public Compra(String numeroTarjeta, double montoCompra, String nombreCliente) {
        this.numeroTarjeta = numeroTarjeta;
        this.montoCompra = montoCompra;
        this.nombreCliente = nombreCliente;
    }

    public String getNumeroTarjeta() {
        return numeroTarjeta;
    }

    public void setNumeroTarjeta(String numeroTarjeta) {
        this.numeroTarjeta = numeroTarjeta;
    }

    public double getMontoCompra() {
        return montoCompra;
    }

    public void setMontoCompra(double montoCompra) {
        this.montoCompra = montoCompra;
    }

    public String getNombreCliente() {
        return nombreCliente;
    }

    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }
    
    public void tomarDatos() {
        
        Scanner teclado = new Scanner(System.in);
               
        System.out.println("Ingrese el Num. de tarjeta: ");
        numeroTarjeta=teclado.nextLine();
        teclado.nextLine();
        
        try {
        
            if (numeroTarjeta.length() != 16 || !numeroTarjeta.matches("\\d{16}")) {
                throw new NumberFormatException("Numero de tarjeta invalido");
            }
        }
        catch (NumberFormatException e) {
            System.out.println(e.getMessage());
            System.out.println("Ingrese solo números.");
        }
        
        System.out.println("Ingrese el monto de compra: ");
        montoCompra=teclado.nextDouble();
        teclado.nextLine();
        
        
        
}
    
    
}
