
package ejercicios_brynt;

import java.util.Scanner;


public class Ejercicio_39 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese la cantidad de alumnos: ");
        int n = scanner.nextInt();
        
        int aprobados = 0;
        int desaprobados = 0;
        
        for (int i = 0; i < n; i++) {
            System.out.print("Ingrese la nota del alumno " + (i+1) + ": ");
            int nota = scanner.nextInt();
            if (nota >= 60) {
                aprobados++;
            } else {
                desaprobados++;
            }
        }
        
        System.out.println("La cantidad de alumnos aprobados es: " + aprobados);
        System.out.println("La cantidad de alumnos desaprobados es: " + desaprobados);
    }
}
