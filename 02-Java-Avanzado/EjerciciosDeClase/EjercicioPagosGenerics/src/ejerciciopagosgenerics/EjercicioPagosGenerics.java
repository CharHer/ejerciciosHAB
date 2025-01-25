
package ejerciciopagosgenerics;

import logica.Cripto;
import logica.Dolar;
import logica.Euro;
import logica.Pago;
import logica.PayPal;
import logica.Tarjeta;
import logica.Transferencia;

public class EjercicioPagosGenerics {

    public static void main(String[] args) {

        Pago<Dolar, Transferencia> pagoDolares = new Pago<>(new Dolar(), 500.0, new Transferencia());
        Pago<Euro, PayPal> pagoEuro = new Pago<>(new Euro(), 350.0, new PayPal());
        Pago<Cripto, Tarjeta> pagoCripto = new Pago<>(new Cripto(), 500.0, new Tarjeta());

        pagoDolares.procesarPago();
        pagoEuro.procesarPago();
        pagoCripto.procesarPago();
        
    }

}
