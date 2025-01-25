
package ejemploclaseanoninterface;

import logica.Saludo;


public class EjemploClaseAnonInterface  {

    public static void main(String[] args) {

        Saludo sal = new Saludo() {
            @Override
            public void saludar() {
                System.out.println("Hola, saludando desde clase anonima");
            }

        };

        sal.saludar();

    }

   
}
