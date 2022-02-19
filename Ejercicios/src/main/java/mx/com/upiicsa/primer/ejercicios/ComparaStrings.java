package mx.com.upiicsa.primer.ejercicios;

public class ComparaStrings {
    public static void main(String [] args){
        String nombreA="JuanÑ",nombreB="juanñ";
        System.out.println("Resultado (case sensitive): " + nombreA.equals(nombreB));
        System.out.println("Resultado (No case sensitive): " + nombreA.equalsIgnoreCase(nombreB));
    }
}
