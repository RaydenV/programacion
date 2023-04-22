
package ejercicio_brynt;

import java.util.Scanner;

public class Ejercicio_51 {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] numeros = new int[20];
        int sumaPares = 0;
        int sumaImpares = 0;

        // Leer los números desde el teclado
        for (int i = 0; i < 20; i++) {
            System.out.print("Ingrese el número #" + (i + 1) + ": ");
            numeros[i] = sc.nextInt();
        }

        // Iterar sobre el arreglo y sumar los números pares e impares
        for (int numero : numeros) {
            if (numero % 2 == 0) {
                sumaPares += numero;
            } else {
                sumaImpares += numero;
            }
        }

        // Imprimir los resultados
        System.out.println("La suma de los números pares es: " + sumaPares);
        System.out.println("La suma de los números impares es: " + sumaImpares);
    }
}
