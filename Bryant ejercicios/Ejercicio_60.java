
package ejercicio_brynt;

import java.util.Scanner;

public class Ejercicio_60 {
    public static void main(String[] args) {
      Scanner entrada = new Scanner(System.in);
      String respuestaCorrecta = "Masaya";
      int intentos = 3;

      System.out.println("Adivinanza: ¿Cuál es la capital del folclore nicaragüense?");
      System.out.println("Tienes " + intentos + " oportunidades para responder.");

      // Ciclo para realizar hasta 3 intentos
      for (int i = 1; i <= intentos; i++) {
         System.out.print("Intento " + i + ": ");
         String respuestaUsuario = entrada.nextLine();

         if (respuestaUsuario.equalsIgnoreCase(respuestaCorrecta)) {
            System.out.println("¡Felicitaciones! ¡Has acertado!");
            return;
         } else {
            System.out.println("Respuesta incorrecta. Inténtalo de nuevo.");
         }
      }

      // Si el usuario no acierta en ningún intento, se muestra la respuesta correcta
      System.out.println("Lo siento, no has acertado.");
      System.out.println("La respuesta correcta es: " + respuestaCorrecta);
   }
}
