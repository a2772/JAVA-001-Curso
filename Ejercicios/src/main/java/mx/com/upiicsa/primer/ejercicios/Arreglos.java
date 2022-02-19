package mx.com.upiicsa.primer.ejercicios;

public class Arreglos {
    public static void main(String[] args){
        int[] edades = {20,30,40};
        int miEdad=edades[0],tuEdad=edades[1];
        System.out.println("Mi edad: " + miEdad + "\n" + "Tu edad: " + tuEdad);
        System.out.println("Del array. Mi edad : " + edades[0] + "\n" + "Tu edad: " + edades[2]);
        
        for(int edad : edades){
            System.out.println("\nLa edad es: " + edad);
        }
    }
}
