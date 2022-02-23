package mx.com.upiicsa.ipn.gestionescolar.util;

import javax.swing.JOptionPane;

public class ValidaInput {
    public ValidaInput(){
        
    }
    public String validaString(String mensaje, int tamMin, int tamMax){
        String cadena = "";
        boolean valido = false;
        do{
            try{
                cadena = JOptionPane.showInputDialog(mensaje);
                if(cadena.length()>=tamMin && cadena.length()<=tamMax){
                    valido = true;
                }else{
                    JOptionPane.showMessageDialog(null, "Error. El tamaño de la frase/palabra debe ser o estar entre " + tamMin + " y " + tamMax);
                }
            }catch(NumberFormatException ex){
                
            }
        }while(!valido);
        return cadena;
    }
    public int validaInt(String mensaje, int limiteInf, int limiteSup){
        int numero = 0;
        boolean valido = false;
        do{
            try{
                numero = Integer.parseInt(JOptionPane.showInputDialog(mensaje));
                if(numero>=limiteInf && numero<=limiteSup){
                    valido = true;
                }else{
                    JOptionPane.showMessageDialog(null, "Error. El dato debe ser entero y el rango debe ser o estar entre " + limiteInf + " y " + limiteSup);
                }
            }catch(NumberFormatException ex){
                
            }
        }while(!valido);
        return numero;
    }
}
