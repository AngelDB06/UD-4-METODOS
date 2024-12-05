package Metodos.biblioteca;

public class estaEnArrayInt {
    public static String estaEnArrayInt(int[] n, int n1) {
        String respuesta="";
        for (int i=0; i<n.length; i++) {
            if (n[i]==n1) {
             respuesta="El número está en el Array";
             break;
            } else {
                respuesta="El número no está en el Array";
            }
        }
        return respuesta;
    }
}
