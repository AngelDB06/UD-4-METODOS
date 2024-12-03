package Metodos;

import java.util.Scanner;

public class ej1 {
    public static String convierteEnPalotes(int n) {
        String converter = Integer.toString(n);
        int letra = 0;
        String conversion = " ";
        for (int i = 0; i < converter.length(); i++) {
            letra = converter.charAt(i) - 48;
            for (int j = 0; j < letra; j++) {
                if (letra == 0) {
                    conversion = conversion + "-";
                } else {
                    conversion = conversion + "|";
                }
            }
            
            conversion=conversion+"-";
        }
        return conversion;
    }

    

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Dime un numero para convertirlo en palotes: ");
        int n1 = scanner.nextInt();
        System.out.println(convierteEnPalotes(n1));
        scanner.close();
    }
}
