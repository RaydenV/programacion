
package ejercicio_brynt;

import java.util.Scanner;

public class Ejercicio_42 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese la cantidad de números a leer: ");
        int n = scanner.nextInt();

        int sumaPositivos = 0;
        int cuentaNegativos = 0;

        for (int i = 0; i < n; i++) {
            System.out.print("Ingrese un número distinto de cero: ");
            int num = scanner.nextInt();

            if (num > 0) {
                sumaPositivos += num;
            } else if (num < 0) {
                cuentaNegativos++;
            }
        }

        System.out.println("La suma de los números positivos es: " + sumaPositivos);
        System.out.println("La cantidad de números negativos es: " + cuentaNegativos);
    }
}
