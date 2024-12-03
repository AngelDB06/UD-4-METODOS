package Metodos;

import java.util.Scanner;

public class ej2 {
    public static String convierteEnPalabras(int n){
        String conversor= Integer.toString(n);
        String[] numeros={"cero", "uno", "dos", "tres", "cuatro", "cinco", "seis", "siete", "ocho", "nueve"};
        String numero=String.valueOf(conversor);
        String palabras=" ";
        String valor="";
        int valorn=0;



        for (int i=0; i<numero.length(); i++) {
            valor=numero.substring(i, i+1);
            valorn= Integer.parseInt(valor);
            palabras=palabras+", "+numeros[valorn];
        }
        return palabras;
    }
    
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        

        System.out.println("Introduce un número y cada cifra se convertirá en el número en letras.");
        int n1= scanner.nextInt();
        System.out.print(convierteEnPalabras(n1));
        scanner.close();
    }
}
