
package ejercicio_brynt;

import java.util.Scanner;

public class Ejercicio_59 {
    public static void main(String[] args) {
      Scanner entrada = new Scanner(System.in);

      System.out.print("Ingrese un número entero positivo: ");
      int numero = entrada.nextInt();

      int suma = 0;

      // Calcula la suma de los divisores distintos del número
      for (int i = 1; i < numero; i++) {
         if (numero % i == 0) {
            suma += i;
         }
      }

      // Determina si el número es perfecto o no y muestra el resultado
      if (suma == numero) {
         System.out.println("El número " + numero + " es perfecto.");
      } else {
         System.out.println("El número " + numero + " no es perfecto.");
      }
   }
}
