
package ejercicio_brynt;

import java.util.Scanner;


public class Ejercicio_43 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        final int NUM_ALUMNOS = 25;
        final int NUM_EXAMENES = 3;

        String[][] estudiantes = new String[NUM_ALUMNOS][NUM_EXAMENES + 1];

        for (int i = 0; i < NUM_ALUMNOS; i++) {
            System.out.println("Ingrese los datos del estudiante " + (i + 1) + ":");
            System.out.print("Nombre: ");
            estudiantes[i][0] = scanner.nextLine();

            for (int j = 1; j <= NUM_EXAMENES; j++) {
                System.out.print("Nota " + j + ": ");
                estudiantes[i][j] = scanner.nextLine();
            }
        }
        
        for (int i = 0; i < NUM_ALUMNOS; i++) {
            double sumaNotas = 0;

            for (int j = 1; j <= NUM_EXAMENES; j++) {
                sumaNotas += Double.parseDouble(estudiantes[i][j]);
            }

            double promedio = sumaNotas / NUM_EXAMENES;

            System.out.println("El promedio de las notas de " + estudiantes[i][0] + " es " + promedio);
        }
    }
}
