

package com.hackaboss.ejercicioonetomanyfestivalcinedia3;

import logica.Festival;
import logica.Horario;
import logica.Pelicula;
import logica.Sala;
import persistencia.ControladoraPersisitencia;

public class EjercicioOneToManyFestivalCineDia3 {

    public static void main(String[] args) {
        
        
        ControladoraPersisitencia controlPersis = new ControladoraPersisitencia();
        
        //Primero: se crea el festival
        Festival festival = new Festival();
        festival.setNombreFestival("Festival de Cine Internacional");
        controlPersis.crearFestival(festival);
        
        //Segundo: se crean dos salas y se asignan al festival creado
        Sala sala1 = new Sala();
        
        
        sala1.setNombreSala("S-01");
        sala1.setCapacidad(50);
        sala1.setFestival(festival);
        
        Sala sala2 = new Sala();
        sala2.setNombreSala("S-02");
        sala2.setCapacidad(40);
        sala2.setFestival(festival);
        
        controlPersis.crearSala(sala1);
        controlPersis.crearSala(sala2);
        
        //Tercero: se crean horarios (no se puede tener la pelicula sin un horario establecido)
        
        Horario horario1 = new Horario();
        horario1.setHoraInicio("11:30");
        horario1.setHoraFin("13:05");
        
        Horario horario2 = new Horario();
        horario2.setHoraInicio("13:20");
        horario2.setHoraFin("14:55");
        
        Horario horario3 = new Horario();
        horario3.setHoraInicio("15:10");
        horario3.setHoraFin("16:45");
        
        Horario horario4 = new Horario();
        horario4.setHoraInicio("17:00");
        horario4.setHoraFin("18:35");
        
        Horario horario5 = new Horario();
        horario5.setHoraInicio("18:50");
        horario5.setHoraFin("20:25");
        
        controlPersis.crearHorario(horario1);
        controlPersis.crearHorario(horario2);
        controlPersis.crearHorario(horario3);
        controlPersis.crearHorario(horario4);
        controlPersis.crearHorario(horario5);
        
        //Cuarto: se crean las peliculas, se les asignan salas y horarios 
        
        Pelicula pelicula1 = new Pelicula();
        pelicula1.setTitulo("El gato con botas 2");
        pelicula1.setDirector("Joel Crawford");
        pelicula1.setDuracion(132);
        pelicula1.setUnHorario(horario5);
        
        Pelicula pelicula2 = new Pelicula();
        pelicula2.setTitulo("Titanes del Pacifico");
        pelicula2.setDirector("Guillermo del Toro");
        pelicula2.setDuracion(140);
        pelicula2.setUnHorario(horario3);
        
        Pelicula pelicula3 = new Pelicula();
        pelicula3.setTitulo("Los increibles");
        pelicula3.setDirector("Brad Bird");
        pelicula3.setDuracion(125);
        pelicula3.setUnHorario(horario1);
        
        controlPersis.crearPelicula(pelicula1);
        controlPersis.crearPelicula(pelicula2);
        controlPersis.crearPelicula(pelicula3);
        
    }
}
