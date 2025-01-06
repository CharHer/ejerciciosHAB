

package com.hackaboss.ejercicioonetomanytorneo;

import java.time.LocalDate;
import logica.Categoria;
import logica.Inscripcion;
import logica.Programador;
import logica.Torneo;
import persistencia.ControladoraPersistencia;


public class EjercicioOneToManyTorneo {

    public static void main(String[] args) {
        
        ControladoraPersistencia controlPersis = new ControladoraPersistencia();
        
        //1. Crear torneo
        Torneo torneo = new Torneo();
        torneo.setNombreTorneo("Torneo mundial de progranacion");
        controlPersis.crearTorneo(torneo); //persisitit el torneo en BD
        
        //2. Crear 2 categorias
        Categoria categoria1 = new Categoria();
        categoria1.setNombreCategoria("Hackathons relampago");
        categoria1.setTorneo(torneo); //asignar la categoria al torneo
        
        Categoria categoria2 = new Categoria();
        categoria2.setNombreCategoria("Algoritmos en tiempo real");
        categoria2.setTorneo(torneo); //asignar la categoria al torneo
        
        //persistir categorias en BD
        controlPersis.crearCategoria(categoria1);
        controlPersis.crearCategoria(categoria2);
        
        //3. Se crean programadores
        Programador programador1 = new Programador();
        programador1.setNombre("Juan");
        programador1.setApellido("Perez");
        programador1.setNivelAcademico("intermedio");
        
        Programador programador2 = new Programador();
        programador2.setNombre("Ana");
        programador2.setApellido("Gomez");
        programador2.setNivelAcademico("avanzado");
        
        Programador programador3 = new Programador();
        programador3.setNombre("Carlos");
        programador3.setApellido("Martinez");
        programador3.setNivelAcademico("principiante");
        
        //persisitir programadores
        controlPersis.crearProgramador(programador1);
        controlPersis.crearProgramador(programador2);
        controlPersis.crearProgramador(programador3);
        
        //4. crear inscripciones y asignar categorias y programadores
        Inscripcion inscripcion1 = new Inscripcion();
        inscripcion1.setFecha(LocalDate.now());
        inscripcion1.setCategoria(categoria1);
        inscripcion1.setProgramador(programador1);
        
        Inscripcion inscripcion2 = new Inscripcion();
        inscripcion2.setFecha(LocalDate.now());
        inscripcion2.setCategoria(categoria2);
        inscripcion2.setProgramador(programador2);
        
        Inscripcion inscripcion3 = new Inscripcion();
        inscripcion3.setFecha(LocalDate.now());
        inscripcion3.setCategoria(categoria1);
        inscripcion3.setProgramador(programador3);
        
        //persistir inscripciones
        controlPersis.crearInscripcion(inscripcion1);
        controlPersis.crearInscripcion(inscripcion2);
        controlPersis.crearInscripcion(inscripcion3);
        
        System.out.println("Datos cargados exitosamente");
        
    }
}
