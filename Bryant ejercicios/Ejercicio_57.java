
package ejercicio_brynt;

import java.util.Scanner;

public class Ejercicio_57 {
    public static void main(String[] args) {
      Scanner entrada = new Scanner(System.in);

      System.out.print("Ingrese un número entero: ");
      int numero = entrada.nextInt();

      int suma = 0;
      int digito;

      // Calcula la suma de los dígitos del número
      while (numero > 0) {
         digito = numero % 10;
         suma += digito;
         numero /= 10;
      }

      // Muestra la suma de los dígitos del número
      System.out.println("La suma de los dígitos del número es: " + suma);
   }
}
