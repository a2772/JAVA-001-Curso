package mx.com.upiicsa.primer.gestionescolar.alumno;
public class Alumno {
    public String nombre;
    public String primerApellido;
    public String segundoApellido;
    public String boleta;
    public int inscribir(){
        int estadoInscripcion;
        System.out.println("Me inscribí");
        estadoInscripcion = 1;
        return estadoInscripcion;
    }
}
