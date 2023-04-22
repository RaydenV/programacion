
package ejercicio_brynt;
import java.util.Scanner;

/**
 *
 * @author jr813
 */
public class Ejercicio_50 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese un número: ");
        int num = sc.nextInt();
        System.out.println("Los divisores de " + num + " son:");

        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                System.out.println(i);
            }
        }
    }
}
