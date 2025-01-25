
package logica;


import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;


public class RegistroMascotas {

    private List<Mascota<?>> listaMascotas;

    public RegistroMascotas() {
        this.listaMascotas = new ArrayList<>();
    }

    // Método para agregar mascotas al registro
    public <T> void agregarMascota(Mascota<T> mascota) {
        listaMascotas.add(mascota);
        System.out.println("Mascota agregada: " + mascota);
    }

    // Método para buscar mascotas por nombre
    public List<Mascota<?>> buscarPorNombre(String nombre) {
        return listaMascotas.stream()
                .filter(mascota -> mascota.getNombre().equalsIgnoreCase(nombre))
                .collect(Collectors.toList());
    }

    // Método para buscar mascotas por especie
    public <T> List<Mascota<T>> buscarPorEspecie(T especie) {
        return listaMascotas.stream()
                .filter(mascota -> especie.equals(mascota.getEspecie()))
                .map(mascota -> (Mascota<T>) mascota)
                .collect(Collectors.toList());
    }

    // Método para contar el total de mascotas
    public int contarMascotas() {
        return listaMascotas.size();
    }

    // Método para generar datos aleatorios de mascotas
    public void generarMascotasAleatorias(int cantidad) {
        String[] nombres = {"Max", "Bella", "Charlie", "Luna", "Rocky"};
        String[] especies = {"Perro", "Gato", "Reptil", "Ave"};
        Random random = new Random();

        for (int i = 1; i <= cantidad; i++) {
            String id = "MASC" + i;
            String nombre = nombres[random.nextInt(nombres.length)];
            int edad = random.nextInt(15) + 1;  // Edad entre 1 y 15
            String especie = especies[random.nextInt(especies.length)];

            agregarMascota(new Mascota<>(id, nombre, edad, especie));
        }
    }
}


