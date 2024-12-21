
package ejerciciomatricescalificaciones;

import java.util.Scanner;


    public class EjercicioMatricesCalificaciones {


        public static void main(String[] args) {

            Scanner teclado = new Scanner(System.in);

            int notas[][] = new int [4][4];
            double suma;

            System.out.println("Ingrese la nota: ");

            for (int f=0;f<notas.length;f++){
                suma = 0;
                for (int c=0;c<notas[f].length - 1;c++){
                    System.out.println ("Ingrese valor para la fila "+f+ " , columna "+c+": ");
                        notas[f][c] = teclado.nextInt();
                        suma=suma+notas[f][c];

                }

                notas[f][3] = (int) (suma / 3);

            }

           System.out.println("\nLas calificaciones ingresadas son:");
            for (int f = 0; f < notas.length; f++) {
                for (int c = 0; c < notas[f].length; c++) {
                    System.out.print(notas[f][c] + " ");
                }

                System.out.println();

        }

    }

    }