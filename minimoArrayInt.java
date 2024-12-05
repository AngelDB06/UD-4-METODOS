package Metodos.biblioteca;

public class minimoArrayInt {
    public static int minimoArrayint(int[] n) {
        int minimo=n[0];
        for (int i=0; i<n.length; i++) {
            if (n[i]<minimo) {
                minimo=n[i];
            }
        }
        return minimo;
    }
}
