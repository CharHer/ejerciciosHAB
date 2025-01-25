
package com.hackabos.persistencia;

import com.hackabos.persistencia.exceptions.NonexistentEntityException;
import com.hackaboss.logica.Persona;
import com.hackaboss.logica.Usuario;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;


public class ControladoraPersistencia {
    
    PersonaJpaController persoJpa = new PersonaJpaController();
    UsuarioJpaController usuJpa = new UsuarioJpaController();
    
    public void crearPersona(Persona pers) {
        //yo voy a llamar al jpaController y le voy a pasar la persona para que cree
        persoJpa.create(pers);
    }

    public List<Persona> traerPersonas() { 
        return persoJpa.findPersonaEntities();
    }

    public List<Persona> buscarPorApellido(String busquedaApellido) {
        return persoJpa.findPersonaByApellido(busquedaApellido);
    }

    //esto es borrado FÍSICO no es una muy buena práctica
    //investigar borrado lógico
    public void eliminarPersona(Long id) {
        try {
            persoJpa.destroy(id);
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

     public Persona traerPersona(Long id) {
        return persoJpa.findPersona(id);
    }

    public void editarPersona(Persona pers) {
        try {
            persoJpa.edit(pers);
        } catch (Exception ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public Usuario buscarUsuario(String email) {
        return usuJpa.findUserByEmail(email);
    }
    
}
