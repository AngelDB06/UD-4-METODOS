package Metodos.biblioteca;

public class maximoArrayInt {
    public static int maximoArrayint(int[] n) {
        int maximo=n[0];
        for (int i=0; i<n.length; i++) {
            if (n[i]>maximo) {
                maximo=n[i];
            }
        }
        return maximo;
    }
}
