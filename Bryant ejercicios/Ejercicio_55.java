
package ejercicio_brynt;

import java.util.Scanner;

public class Ejercicio_55 {
    public static void main(String[] args) {
      Scanner entrada = new Scanner(System.in);
      int[] numeros = new int[20];

      // Solicita al usuario que ingrese los 20 números
      for (int i = 0; i < numeros.length; i++) {
         System.out.print("Ingrese un número entero: ");
         numeros[i] = entrada.nextInt();
      }

      // Muestra los elementos que ocupan posiciones impares en el array
      System.out.println("Los elementos que ocupan posiciones impares son:");
      for (int i = 1; i < numeros.length; i += 2) {
         System.out.println(numeros[i]);
      }
   }
}
