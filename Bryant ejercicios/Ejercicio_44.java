
package cejercicio_brynt;

import java.util.Scanner;

public class Ejercicio_44 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese su edad: ");
        int edad = sc.nextInt();
        
        String mensaje = "";
        for (int i = 1; i <= 3; i++) {
            if (i == 1 && edad < 13) {
                mensaje = "niño";
                break;
            } else if (i == 2 && edad <= 25) {
                mensaje = "joven";
                break;
            } else if (i == 3) {
                mensaje = "adulto";
            }
        }
        
        System.out.println("Usted es " + mensaje);
    }
}
