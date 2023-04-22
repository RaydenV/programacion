
package ejercico_brynt;

import java.util.Scanner;

public class Ejercico_53 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num, sumaPares = 0, sumaImpares = 0;

        for (int i = 1; i <= 20; i++) {
            System.out.print("Ingrese el número " + i + ": ");
            num = sc.nextInt();

            if (num % 2 == 0) { // si el número es par
                sumaPares += num; // se suma a la suma de pares
            } else { // si el número es impar
                sumaImpares += num; // se suma a la suma de impares
            }
        }

        System.out.println("La suma de los números pares es: " + sumaPares);
        System.out.println("La suma de los números impares es: " + sumaImpares);

    }
}
