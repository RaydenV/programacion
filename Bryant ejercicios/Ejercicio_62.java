

package ejercicio_brynt;

public class Ejercicio_brynt {
    public static void main(String[] args) {
      int contador = 0;
      int numero = 1;

      while (contador < 3) {
         int suma = 0;
         for (int i = 1; i < numero; i++) {
            if (numero % i == 0) {
               suma += i;
            }
         }

         if (suma == numero) {
            System.out.println(numero + " es un número perfecto.");
            contador++;
         }

         numero++;
      }
   }
}
