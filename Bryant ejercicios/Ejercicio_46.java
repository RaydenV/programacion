
package ejercicio_brynt;

public class Ejercicio_46 {

    public static void main(String[] args) {
        int[] arreglo = {1, 2, 3, 4, 5};
        int suma = 0;
        int sumaCuadrados = 0;
        int menor = arreglo[0];
        int posicionMenor = 0;
        int mayor = arreglo[0];
        int posicionMayor = 0;
        
        
        //suma
        for (int i = 0; i < arreglo.length; i++) {
            suma += arreglo[i];
        }
        //suma de cuadrados
        for (int i = 0; i < arreglo.length; i++) {
            sumaCuadrados += arreglo[i] * arreglo[i];
        }
        //El menor elemento y la posición del mismo dentro del arreglo
        for (int i = 1; i < arreglo.length; i++) {
            if (arreglo[i] < menor) {
                menor = arreglo[i];
                posicionMenor = i;
            }
        }
        //El mayor elemento y la posición del mismo dentro del arreglo.
        for (int i = 1; i < arreglo.length; i++) {
            if (arreglo[i] > mayor) {
                mayor = arreglo[i];
                posicionMayor = i;
            }
        }
        //Promedio e los elementos
        for (int i = 0; i < arreglo.length; i++) {
            suma += arreglo[i];
        }
        double promedio = (double) suma / arreglo.length;

        //Ordenados de forma ascendente
        int n = arreglo.length; // longitud del arreglo

        // implementar el algoritmo de burbuja para ordenar el arreglo
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arreglo[j] > arreglo[j + 1]) {
                    // intercambiar los elementos si están en el orden incorrecto
                    int temp = arreglo[j];
                    arreglo[j] = arreglo[j + 1];
                    arreglo[j + 1] = temp;
                }
            }
        }
        

        //modulo del arreglo
        int modulo = 0;
        for (int i = 0; i < arreglo.length; i++) {
            modulo += Math.abs(arreglo[i]);
        }
        System.out.println("La suma de los elementos es: " + suma);
        System.out.println("La suma de los elementos elevados al cuadrado es: " + sumaCuadrados);
        System.out.println("El menor elemento es " + menor + " y se encuentra en la posición " + posicionMenor);
        System.out.println("El mayor elemento es " + mayor + " y se encuentra en la posición " + posicionMayor);
        System.out.println("El promedio de los elementos es: " + promedio);
        System.out.println("El arreglo ordenado en orden ascendente es: ");
        System.out.println("El módulo del arreglo es: " + modulo);
        System.out.println("El arreglo ordenado de forma ascendente es:");
        for (int i = 0; i < n; i++) {
            System.out.print(arreglo[i] + " ");
        }

    }
}
