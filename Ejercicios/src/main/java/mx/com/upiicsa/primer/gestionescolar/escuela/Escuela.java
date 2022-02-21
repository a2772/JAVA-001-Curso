package mx.com.upiicsa.primer.gestionescolar.escuela;

import mx.com.upiicsa.primer.gestionescolar.alumno.Alumno;

public class Escuela {
    public static void main(String [] args){
        //Ejemplo de una violación del principio de encapsulamiento en la clase alumno
        
        //Instancia del alumno
        Alumno alumno = new Alumno();
        //Declaración de las variables
        alumno.nombre = "Paris";
        alumno.primerApellido = "Ramírez";
        alumno.segundoApellido = "Saldaña";
        alumno.boleta = "2020600899";
        //Impresión en pantalla
        System.out.println("Nombre: " + alumno.nombre
        + "\nPrimer apellido: " + alumno.primerApellido
        + "\nSegundo apellido: " + alumno.segundoApellido
        + "\nBoleta: " + alumno.boleta);
        
        //Instancia del alumno 2
        Alumno alumno2 = new Alumno();
        //Declaración de las variables
        alumno2.nombre = "Alberto";
        alumno2.primerApellido = "Sánchez";
        alumno2.segundoApellido = "Gómez";
        alumno2.boleta = "2020245761";
        //Impresión en pantalla
        System.out.println("Nombre: " + alumno2.nombre
        + "\nPrimer apellido: " + alumno2.primerApellido
        + "\nSegundo apellido: " + alumno2.segundoApellido
        + "\nBoleta: " + alumno2.boleta);
    }
}
