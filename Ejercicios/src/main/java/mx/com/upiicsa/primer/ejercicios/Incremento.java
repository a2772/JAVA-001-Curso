package mx.com.upiicsa.primer.ejercicios;

public class Incremento {
    public static void main(String [] args){
        int x = 10;
        int y = 5;
        int total = ++x*3 + y;
        System.out.println("Total de ++x*3 + y: " + total);
        x = 10;
        total = x++*3 + y;
        System.out.println("Total de x++*3 + y: " + total);
    }
}
