package mx.com.upiicsa.ipn.gestionescolar;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import mx.com.upiicsa.ipn.gestionescolar.alumno.Alumno;
import mx.com.upiicsa.ipn.gestionescolar.escuela.Escuela;

public class PruebaAplicacion {

    public static void main(String[] args) {
        Escuela escuela = new Escuela();
        ArrayList<Alumno> alumnos = escuela.getAlumnos();
        String resultadoAlumnos = "Listado de los alumnos registrados";
        //Imprimimos los datos de la lista por cada alumno, primero pasandola a una cadena
        int contadorAlumno = 1;
        for (Alumno alumnoFor : alumnos) {
            String cadenaAlumno = "";
            cadenaAlumno += "Alumno " + contadorAlumno + " de " + alumnos.size() + ":\n__________________________________________\n";
            cadenaAlumno += "Nombre: " + alumnoFor.getNombre() + "\n";
            cadenaAlumno += "Primer apellido: " + alumnoFor.getPrimerApellido()+ "\n";
            cadenaAlumno += "Segundo apellido: " + alumnoFor.getSegundoApellido()+ "\n";
            cadenaAlumno += "Boleta: " + alumnoFor.getBoleta()+ "\n";
            resultadoAlumnos += "\n" + cadenaAlumno;
            contadorAlumno++;
        }
        JOptionPane.showMessageDialog(null, resultadoAlumnos);
    }
}
