package mx.com.upiicsa.ipn.gestionescolar.alumno;
public class Alumno {
    public String nombre;
    private String primerApellido;
    private String segundoApellido;
    private String boleta;
    
    public int inscribir(){
        int estadoInscripcion;
        System.out.println("Me inscribí");
        estadoInscripcion = 1;
        return estadoInscripcion;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getPrimerApellido() {
        return primerApellido;
    }
    public void setPrimerApellido(String primerApellido) {
        this.primerApellido = primerApellido;
    }
    public String getSegundoApellido() {
        return segundoApellido;
    }
    public void setSegundoApellido(String segundoApellido) {
        this.segundoApellido = segundoApellido;
    }
    public String getBoleta() {
        return boleta;
    }
    public void setBoleta(String boleta) {
        this.boleta = boleta;
    }
}

