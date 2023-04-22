
package ejercicio_brynt;

public class Ejercicio_47 {
    public static void main(String[] args) {
        int[] A = {1, 2, 3};
        int[] B = {4, 5, 6};

        //Producto punto
        int productoPunto = 0;
        for (int i = 0; i < A.length; i++) {
            productoPunto += A[i] * B[i];
        }
        System.out.println("El producto punto de A y B es: " + productoPunto);

        //Son ortogonales
        if (productoPunto == 0) {
            System.out.println("A y B son ortogonales");
        } else {
            System.out.println("A y B no son ortogonales");
        }

        // c) Expresión Z
        int productoArreglos = 1;
        int moduloA = 0;
        int moduloB = 0;
        for (int i = 0; i < A.length; i++) {
            productoArreglos *= A[i] * B[i];
            moduloA += A[i] * A[i];
            moduloB += B[i] * B[i];
        }
        double z = (double) productoArreglos / (Math.sqrt(moduloA) * Math.sqrt(moduloB));
        System.out.println("La expresión Z es: " + z);
    }
}
