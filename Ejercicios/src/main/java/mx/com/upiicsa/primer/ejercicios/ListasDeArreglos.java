package mx.com.upiicsa.primer.ejercicios;

import java.util.ArrayList;

public class ListasDeArreglos {
    public static void main (String[] args){
        ArrayList<String> listaNombre = new ArrayList<>();
        String nombreBuscar = "Miguel";
        listaNombre.add("Juan");
        listaNombre.add("Miguel");
        System.out.println("Número de ítems en la arraylist: " + listaNombre.size());
        listaNombre.add("Pedro");
        System.out.println("Número de ítems en la arraylist al añadir a Pedro: " + listaNombre.size());
        
        for(String nombre : listaNombre){
            System.out.println("\nNombre: " + nombre);
            if(nombre.equals(nombreBuscar)){
                break;
            }
        }
    }
}
