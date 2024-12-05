package Metodos.biblioteca;

public class generaArrayInt {
    public static int[] generaArrayint(int n) {
        int[] numeros=new int[n];
        for (int i=0; i<n; i++) {
            numeros[i]= (int) (Math.random()*101);
        }
        return numeros;
    }
}
