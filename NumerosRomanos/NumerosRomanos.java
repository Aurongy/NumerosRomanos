//Realizar en java un programa que solicite un numero Romano y muestre
//en consola en letras su respectivo valor. Esta tarea debe de incluir 
//fotografía de su cuaderno donde demuestre que realizó el ejercicio 
//en clase y adicional debe de adjuntar el archivo .java

import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;

public class NumerosRomanos {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese un Numero Romano: ");
        String romano = scanner.next();
        
        int entero = convercionRomano(romano);
        System.out.println("El valor entero es: " + entero);
        
    }
  
    public static int convercionRomano(String romano){
        Map<Character, Integer> valores = new HashMap<>();
        valores.put('I', 1);
        valores.put('V', 5);
        valores.put('X', 10);
        valores.put('L', 50);
        valores.put('C', 100);
        valores.put('D', 500);
        valores.put('M', 1000);
        
        int entero = 0;
        
        for (int i = 0; i < romano.length(); i++){
            if (i>0 && valores.get(romano.charAt(i)) > valores.get(romano.charAt(i - 1))){
                entero += valores.get(romano.charAt(i)) - 2 * valores.get(romano.charAt(i - 1));         
            }else{
                entero += valores.get(romano.charAt(i));
            }
        }
        return entero;
        
    }          
}
