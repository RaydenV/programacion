
package ejercicio_brynt;

import java.util.Scanner;

public class Ejercicio_45 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        double[] voltajes;

        System.out.println("Ingrese la cantidad de voltajes: ");
        n = sc.nextInt();

        voltajes = new double[n];
        System.out.println("Ingrese los voltajes:");

        for (int i = 0; i < n; i++) {
            voltajes[i] = sc.nextDouble();
        }

        double voltajeMinimo = voltajes[0];
        double voltajeMaximo = voltajes[0];
        double sumaVoltajes = voltajes[0];

        for (int i = 1; i < n; i++) {
            if (voltajes[i] < voltajeMinimo) {
                voltajeMinimo = voltajes[i];
            }
            if (voltajes[i] > voltajeMaximo) {
                voltajeMaximo = voltajes[i];
            }
            sumaVoltajes += voltajes[i];
        }

        double promedioVoltajes = sumaVoltajes / n;

        System.out.println("El voltaje mínimo es: " + voltajeMinimo);
        System.out.println("El voltaje máximo es: " + voltajeMaximo);
        System.out.println("El promedio de los voltajes es: " + promedioVoltajes);

    }
}
