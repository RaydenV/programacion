
package ejercicio_brynr;

import java.util.Scanner;

public class Ejercicio_52 {
   public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, positivos = 0, negativos = 0, cero = 0;

        for (int i = 1; i <= 20; i++) {
            System.out.print("Ingrese el número " + i + ": ");
            n = sc.nextInt();
            if (n > 0) {
                positivos++;
            } else if (n < 0) {
                negativos++;
            } else {
                cero++;
            }
        }

        System.out.println("Cantidad de números positivos: " + positivos);
        System.out.println("Cantidad de números negativos: " + negativos);
        System.out.println("Cantidad de números iguales a cero: " + cero);
    }
}
