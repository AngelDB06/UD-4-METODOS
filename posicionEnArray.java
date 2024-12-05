package Metodos.biblioteca;

public class posicionEnArray {
    public static int posicionEnArrayInt(int[] n, int n1) {
        int posicion=0;
        for (int i=0; i<n.length; i++) {
            if (n[i]==n1) {
             posicion=i;
             break;
            } else {
                posicion=-1;
            }
        }
        return posicion;
    }
}
