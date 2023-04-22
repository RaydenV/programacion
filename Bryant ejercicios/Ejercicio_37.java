
package ejercicio_brynt;

import java.util.Scanner;

public class Ejercicio_37 {

     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese la cantidad de numeros que desea ingresar: ");
        int n = scanner.nextInt();
        
        int pares = 0;
        int impares = 0;
        
        for (int i = 0; i < n; i++) {
            System.out.print("Ingrese el numero " + (i+1) + ": ");
            int numero = scanner.nextInt();
            if (numero % 2 == 0) {
                pares++;
            } else {
                impares++;
            }
        }
        
        System.out.println("La cantidad de numeros pares es: " + pares);
        System.out.println("La cantidad de numeros impares es: " + impares);
    }
}
