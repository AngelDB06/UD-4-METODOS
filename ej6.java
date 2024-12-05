package Metodos;
import Metodos.biblioteca.generaArrayInt;
import Metodos.biblioteca.maximoArrayInt;
import Metodos.biblioteca.mediaArrayInt;
import Metodos.biblioteca.minimoArrayInt;
import Metodos.biblioteca.estaEnArrayInt;
import Metodos.biblioteca.posicionEnArray;
import Metodos.biblioteca.volteaArrayInt;
import Metodos.biblioteca.rotaDerechaArrayInt;

import java.util.Arrays;
import java.util.Scanner;

public class ej6 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=0;

        System.out.println("Introduce la cantidad de números aleatorios que quieres.");
        n=scanner.nextInt();
        System.out.print(Arrays.toString(generaArrayInt.generaArrayint(n)));

        System.out.println();
        System.out.println();


        int[] n2={6,8,10,9,2};
        System.out.println(minimoArrayInt.minimoArrayint(n2));

        System.out.println();

        int[] n3={6,8,10,9,2};
        System.out.println(maximoArrayInt.maximoArrayint(n3));

        System.out.println();

        int[] n4={6,8,10,9,2};
        System.out.println(mediaArrayInt.mediaArrayint(n4));

        System.out.println();
        
        System.out.println("Introduce el número que creas que esté en el Array");
        int n6=scanner.nextInt();
        int[] n5={6,8,10,9,2};
        System.out.println(estaEnArrayInt.estaEnArrayInt(n5, n6));

        System.out.println();

        System.out.println("Introduce un número para saber su posición en el Array, si no está, se devolverá un '-1'");
        int n8=scanner.nextInt();
        int[] n7={6,8,10,9,2};
        System.out.print("La posición del número es: ");
        System.out.println(posicionEnArray.posicionEnArrayInt(n7, n8));

        System.out.println();

        int[] n9={6,8,10,9,2};
        System.out.println(Arrays.toString(volteaArrayInt.volteaArrayInt(n9)));

        System.out.println();

        System.out.println("Indica el número de posiciones que quieres que roten a la derecha los números del array");
        int n10=scanner.nextInt();
        int[] n11={6,8,10,9,2};
        System.out.println(Arrays.toString(rotaDerechaArrayInt.rotaDerechaArrayInt(n11, n10)));

        System.out.println("Indica el número de posiciones que quieres que roten a la izquierda los números del array");
        int n12=scanner.nextInt();
        int[] n13={6,8,10,9,2};
        System.out.println(Arrays.toString(rotaDerechaArrayInt.rotaDerechaArrayInt(n13, n12)));

        scanner.close();
    }
}