
package com.hackaboss.logica;

import com.hackabos.persistencia.ControladoraPersistencia;
import java.util.ArrayList;
import java.util.List;


public class ControladoraLogica {

    ControladoraPersistencia controlPersis = new ControladoraPersistencia();

    public void crearPersona(String nombre, String apellido, String telefono) {

        Persona pers = new Persona(nombre, apellido, telefono);
        controlPersis.crearPersona(pers);

    }

    public List<Persona> buscarPorApellido(String busquedaApellido) {
        //estoy haciendo el filtrado en la LÓGICA
        //esto es MENOS eficiente que si lo hago en la BD
        List<Persona> personasCoincidentes = new ArrayList<>();

        //opción 1
        //paso este dato a la lógica, la lógica le pide TODOS los datos a la persistencia/BD y la lógica se encarga
        //de filtrar
        //filtro apellido
        /*  List<Persona> listaPersonas = controlPersis.traerPersonas();
                
        for (Persona pers : listaPersonas) {
            if (pers.getApellido().equals(busquedaApellido)) {
                personasCoincidentes.add(pers);
            }
        }*/
 /*opción 2
        Paso este dato a la lógica, la lógica le pide a la persistencia que traiga SOLO LOS DATOS QUE COINCIDAN,
        y la lógica solo responde los datos ya filtrados desde la BD 
         */
        //la base de datos se encarga de traer todo filtrado
        personasCoincidentes = controlPersis.buscarPorApellido(busquedaApellido);

        return personasCoincidentes;
    }

    public void eliminarPersona(Long id) {
        controlPersis.eliminarPersona(id);
    }

    public Persona buscarPersona(Long id) {
        return controlPersis.traerPersona(id);
    }

    public void editarPersona(Persona pers) {
        controlPersis.editarPersona(pers);
    }

    public boolean validarAcceso(String email, String password) {
        
        Usuario usu = controlPersis.buscarUsuario(email);
        
        //vamos a manipular contrasenas en texto plano, no es una buena practica de seguridad
        if (usu != null) {

            if (usu.getEmail().equals(email)) {
                if (usu.getPassword().equals(password)) {
                    return true;
                }
            }
        }
        return false;
    }

}
