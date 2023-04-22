
package ejercicio_brynt;

import java.util.Scanner;

public class Ejercicio_48 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Pedir al usuario las dimensiones de la matriz
        System.out.print("Ingrese el número de filas: ");
        int filas = sc.nextInt();

        System.out.print("Ingrese el número de columnas: ");
        int columnas = sc.nextInt();

        // Declarar la matriz
        int[][] matriz = new int[filas][columnas];

        // Pedir al usuario que ingrese los elementos de la matriz
        System.out.println("Ingrese los elementos de la matriz:");
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                System.out.print("Elemento [" + i + "][" + j + "]: ");
                matriz[i][j] = sc.nextInt();
            }
        }
        
        // Imprimir matriz en orden dado
        System.out.println("Matriz en orden dado:");
        for (int[] matriz1 : matriz) {
            for (int j = 0; j < matriz1.length; j++) {
                System.out.print(matriz1[j] + " ");
            }
            System.out.println();
        }
        
        // Imprimir elementos sobre diagonal principal
        System.out.println("Elementos sobre diagonal principal:");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (i < j) {
                    System.out.print(matriz[i][j] + " ");
                }
            }
        }
        System.out.println();
        
        // Imprimir elementos encima de la diagonal principal
        System.out.println("Elementos encima de la diagonal principal:");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (i < j) {
                    System.out.print(matriz[i][j] + " ");
                }
            }
        }
        System.out.println();
        
        // Imprimir elementos por debajo y sobre la diagonal principal
        System.out.println("Elementos por debajo y sobre la diagonal principal:");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (i <= j) {
                    System.out.print(matriz[i][j] + " ");
                }
            }
        }
        System.out.println();
    }
}
