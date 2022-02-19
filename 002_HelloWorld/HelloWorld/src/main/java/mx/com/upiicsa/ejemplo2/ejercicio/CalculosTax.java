package mx.com.upiicsa.ejemplo2.ejercicio;

import java.util.Scanner;
import org.w3c.dom.ranges.RangeException;

public class CalculosTax {

    public static void main(String[] args) {
        double total;
        double fee;
        double tax = 0.16;
        //Pidiendo el valor
        fee = leeDouble("Ingresa el valor para calcular su total con impuesto: $", 0, 2000000);
        total = fee * tax;
        System.out.println("Total: $" + total);
    }

    private static double leeDouble(String mensaje, double vInf, double vSup) {
        Scanner scanner = new Scanner(System.in);
        double valor=0;
        boolean valid=false;
        while (!valid) {
            try {
                valor = scanner.nextDouble();
                if(valor>=vInf && valor<=vSup){
                    valid=true;
                }
            } catch (NumberFormatException | RangeException exc) {
                System.out.println("Valor introducido erróneo, debe ser un número.");
            }
        }
        return valor;
    }
}
