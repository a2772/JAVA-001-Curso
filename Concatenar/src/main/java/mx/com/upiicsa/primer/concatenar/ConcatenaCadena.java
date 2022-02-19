package mx.com.upiicsa.primer.concatenar;
public class ConcatenaCadena {
    public static void main(String [] args){
        String custName = "Paris ";
        String itemDesc = "compró una camisa";
        String message;
        
        message = custName + itemDesc;
        
        System.out.println("Cadena: " + message);
        System.out.println("Mayúsculas: " + message.toUpperCase());
        System.out.println("Minúsculas: " + message.toLowerCase());
        System.out.println("Longitud de la cadena: " + message.length());
        
    }
}
