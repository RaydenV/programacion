
package ejercicio_brynt;

public class Ejercicio_49 {
    public static void main(String[] args) {
        int[][] a = {{1, 2}, {3, 4}};
        int[][] b = {{5, 6}, {7, 8}};

        // Suma de A y B
        int[][] suma1 = new int[a.length][a[0].length];
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++) {
                suma1[i][j] = a[i][j] + b[i][j];
            }
        }

        // Suma de 2B y 3B
        int[][] suma2 = new int[b.length][b[0].length];
        for (int i = 0; i < b.length; i++) {
            for (int j = 0; j < b[0].length; j++) {
                suma2[i][j] = 2 * b[i][j] + 3 * b[i][j];
            }
        }

        // Imprimir resultados
        System.out.println("La suma de A y B es:");
        imprimirMatriz(suma1);

        System.out.println("La suma de 2B y 3B es:");
        imprimirMatriz(suma2);
    }

    public static void imprimirMatriz(int[][] matriz) {
        for (int[] matriz1 : matriz) {
            for (int j = 0; j < matriz[0].length; j++) {
                System.out.print(matriz1[j] + " ");
            }
            System.out.println();
        }
    }
}
