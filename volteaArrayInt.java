package Metodos.biblioteca;

public class volteaArrayInt {
    public static int[] volteaArrayInt(int[] n) {
        int[] numeros= new int[n.length];
        for (int i=0; i<n.length;i++) {
            numeros[i]=n[(n.length-i)-1];
        }
        return numeros;
    }
}
