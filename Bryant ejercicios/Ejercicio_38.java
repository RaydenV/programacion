

package ejercicio_brynt;

public class Ejercicio_38 {
    public static void main(String[] args) {
        int suma = 0;
        int impares = 0;
        
        for (int i = 20; i <= 100; i++) {
            if (i % 2 != 0) {
                impares++;
                suma += i;
            }
        }
        
        System.out.println("La cantidad de numeros impares entre 20 y 100 es: " + impares);
        System.out.println("La suma de los numeros impares entre 20 y 100 es: " + suma);
    }
}
