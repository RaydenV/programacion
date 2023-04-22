
package ejercicio_brynt;

import java.util.Scanner;

public class Ejercicio_41 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese la cantidad de números a multiplicar: ");
        int n = scanner.nextInt();

        int producto = 1;
        for (int i = 0; i < n; i++) {
            System.out.print("Ingrese el número #" + (i+1) + ": ");
            int num = scanner.nextInt();
            producto *= num;
        }

        System.out.println("El producto de los " + n + " números ingresados es: " + producto);
    }

}
