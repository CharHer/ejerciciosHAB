
package ejemplostreams;

import java.util.Arrays;
import java.util.List;


public class EjemploStreams {

    
    public static void main(String[] args) {
        
        //Lista de paises
        List<String>paises = Arrays.asList(
        "Espana" , "Mexico", "Argentina", "Chile",
           "Alemania", "Portugal", "Colombia", "Peru"
        );
        
        
        //filtrar por los paises que contengan la letra "a"
        paises.stream()
            .filter(pais->pais.toLowerCase().contains("a"))
            .forEach(System.out::println);
        
        
    }
    
}
