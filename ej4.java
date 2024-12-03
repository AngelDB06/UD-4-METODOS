package Metodos;

public class ej4 {
    public static String convierteArrayEnString(int[] n){
        String numero="";
        for (int i=0; i<n.length; i++) {
            numero= numero+Integer.toString(n[i]);
            
        }
        return numero;
    }

    public static void main(String[] args) {
    int[] numeros= {8,9,7,2,4};
    
    System.out.print(convierteArrayEnString(numeros));
    }
}
