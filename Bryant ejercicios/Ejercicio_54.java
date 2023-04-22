
package ejercicio_brynt;

import java.util.Scanner;

public class Ejercicio_54 {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);

      int suma = 0;
      int cantidadNumeros = 0;

      System.out.print("Ingrese la cantidad de números a ingresar: ");
      int cantidad = sc.nextInt();
      
      for (int i = 1; i <= cantidad; i++) {
         System.out.print("Ingrese el número " + i + ": ");
         int numero = sc.nextInt();

         suma += numero;
         cantidadNumeros++;
      }

      double promedio = (double) suma / cantidadNumeros;
      System.out.println("El promedio es: " + promedio);
   }
}
