
package ejercicio_brynt;

import java.util.Scanner;

public class Ejercicio_58 {
    public static void main(String[] args) {
      Scanner entrada = new Scanner(System.in);
      int[] numeros = new int[20];

      // Solicita al usuario que ingrese los 20 números
      for (int i = 0; i < numeros.length; i++) {
         System.out.print("Ingrese un número entero: ");
         numeros[i] = entrada.nextInt();
      }

      // Muestra los elementos que contienen números múltiplos de 5 en el array
      System.out.println("Los elementos que contienen números múltiplos de 5 son:");
      for (int i = 0; i < numeros.length; i++) {
         if (numeros[i] % 5 == 0) {
            System.out.println(numeros[i]);
         }
      }
   }
}
