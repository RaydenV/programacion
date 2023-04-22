
package ejercicio_brynt;

import java.util.Scanner;

public class Ejercicio_34 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese la cantidad de numeros que desea ingresar: ");
        int n = scanner.nextInt();
        
        int[] numeros = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Ingrese el numero " + (i+1) + ": ");
            numeros[i] = scanner.nextInt();
        }
        
        System.out.println("Los numeros ingresados son:");
        for (int i = 0; i < n; i++) {
            System.out.println(numeros[i]);
        }
    } 
}
