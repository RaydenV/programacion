
package ejercicio_brynt;

import java.util.Scanner;

public class Ejercicio_36 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese la cantidad de numeros que desea ingresar: ");
        int n = scanner.nextInt();
        
        double[] numeros = new double[n];
        double suma = 0;
        for (int i = 0; i < n; i++) {
            System.out.print("Ingrese el numero " + (i+1) + ": ");
            numeros[i] = scanner.nextDouble();
            suma += numeros[i];
        }
        
        double promedio = suma / n;
        
        System.out.println("La suma de los numeros es: " + suma);
        System.out.println("El promedio de los numeros es: " + promedio);
    }
}
