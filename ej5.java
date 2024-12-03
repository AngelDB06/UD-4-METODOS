package Metodos;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ej5 {
    public static int[] concatena(int[] a, int[] b) {
        int[] numeros=new int[6];
        for (int i=0; i<a.length;i++) {
            numeros[i]=a[i];
        }
        for (int i=0; i<b.length;i++) {
            numeros[i+b.length]=b[i];
        }
        return numeros;
    }
    public static void main(String[] args) {
        int[] n1= {8,9,0};
        int[] n2= {1,2,3};
        System.out.print(Arrays.toString(concatena(n1, n2)));
    }
}
