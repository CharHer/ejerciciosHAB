
package ejemplotrycatch;

public class EjemploTryCatch {

    public static void main(String[] args) {
        
        int edades[]= new int [3];
        
        try{
        edades[3]=15;
        }
        catch(IndexOutOfBoundsException e){
            System.out.println("El indice 3 no existe (solo 0,1,2)");
        }
        catch(NullPointerException e) {
            System.out.println("Ha intentado acceder a una pocicion nula");
        }
        finally {
            System.out.println("Hola soy el finally");
        }
        
    }
    
}
