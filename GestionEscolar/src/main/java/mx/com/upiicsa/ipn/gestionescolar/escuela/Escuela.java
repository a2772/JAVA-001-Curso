package mx.com.upiicsa.ipn.gestionescolar.escuela;

import java.util.ArrayList;
import mx.com.upiicsa.ipn.gestionescolar.alumno.Alumno;
import mx.com.upiicsa.ipn.gestionescolar.util.ValidaInput;

public class Escuela {
    private ArrayList<Alumno> alumnos;
    
    public Escuela (){
        //Asignamos los alumnos
        inicializaEscuela();
    }
    private void inicializaEscuela(){//Inicializa la escuela con los datos básicos
        //Variables
        String mensajeInicio = "Bienvenid@ a la escuela \"Java\". Ingresa el número de alumnos que vas a registrar: ";
        int numeroAlumnos = 0;
        int contadorAlumnosRegistrados = 0;
        
        //Procedimiento
        ValidaInput validaInput = new ValidaInput();//Clase para validar los datos enteros
        
        numeroAlumnos = validaInput.validaInt(mensajeInicio, 0, 999);
        this.alumnos = new ArrayList<Alumno>();//Instanciamos la arraylist
        while(contadorAlumnosRegistrados < numeroAlumnos){//Mientras falten alumnos por registrar, los agregamos
            Alumno alumno = new Alumno();
            alumno.setNombre(validaInput.validaString("Nombre del alumno " + (contadorAlumnosRegistrados + 1) + "/" + numeroAlumnos + "", 1, 100));
            alumno.setPrimerApellido(validaInput.validaString("Primer apellido del alumno " + (contadorAlumnosRegistrados + 1) + "/" + numeroAlumnos + "", 1, 100));
            alumno.setSegundoApellido(validaInput.validaString("Segundo apellido del alumno " + (contadorAlumnosRegistrados + 1) + "/" + numeroAlumnos + "", 1, 100));
            alumno.setBoleta(validaInput.validaString("Boleta del alumno " + (contadorAlumnosRegistrados + 1) + "/" + numeroAlumnos + "", 10, 10));
            
            //Añadimos a la lista
            this.alumnos.add(alumno);
            
            contadorAlumnosRegistrados++;
        }
    }
    public ArrayList<Alumno> getAlumnos(){
        return this.alumnos;
    }
}
