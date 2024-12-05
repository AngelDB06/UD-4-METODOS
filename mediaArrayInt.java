package Metodos.biblioteca;

public class mediaArrayInt {
    public static int mediaArrayint(int[] n) {
        int suma=0, media;
        for (int i=0; i<n.length; i++) {
            suma=suma+n[i];
        }
        media=suma/n.length;
        return media;
    }
}
