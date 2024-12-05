package Metodos.biblioteca;

public class rotaIzquierdaArrayInt {

    public static int[] rotaIzquierdaArrayInt(int[] n, int n1) {
        int longitud=n.length;
        int[] numeros= new int[longitud];
        
        n1 = n1 % longitud;
        
        for (int i=0; i<n.length;i++) {
            numeros[(i-n1)%longitud ]=n[i];
        }
        return numeros;
    }
    }