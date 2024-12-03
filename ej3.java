package Metodos;

import java.util.Scanner;

public class ej3 {
    
    public static void linea(char caracter, int repeticiones) {
        
        for (int p=0;p<repeticiones; p++) {
            for (int i=0; i<repeticiones-p;i++){
                System.out.print(caracter);
            }
            System.out.println();
        }
        
    }
    
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=0;
        String letra;
        char letra2;
        
        System.out.println("Introduce un caracter");
        letra=scanner.nextLine();
        letra2= letra.charAt(0);
        System.out.println("Introduce la altura");
        n=scanner.nextInt();
        linea(letra2, n);
        scanner.close();
    }
}