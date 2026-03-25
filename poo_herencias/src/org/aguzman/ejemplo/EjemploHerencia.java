package org.aguzman.ejemplo;

import org.aguzman.pooherencia.*;

public class EjemploHerencia {

    public static void main(String[] args) {
        Persona alumno = new Alumno();
        alumno.setNombre("Andres");
        alumno.setApelldio("Guzman");
        ((Alumno)alumno).setInstitucion("Intituto Nacional");

        Profesor profesor = new Profesor();
        profesor.setNombre("Luci");
        profesor.setApelldio("Perez");
        profesor.setAsignatura("Matematicas");

        System.out.println(alumno.getNombre()
                + " " + alumno.getApelldio()
                + " " + ((Alumno) alumno).getInstitucion());
        System.out.println("Profesor " + profesor.getAsignatura() + ": " +
                profesor.getNombre() + " " + profesor.getApelldio());

    }

}
