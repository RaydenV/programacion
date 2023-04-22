
package ejercicio_brynt;


import java.util.Scanner;

public class Ejercicio32 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Ingrese la calificación del alumno:");
    double calificacion = sc.nextDouble();
    if (calificacion >= 90) {
      System.out.println("La calificación es A.");
    } else if (calificacion >= 80) {
      System.out.println("La calificación es B.");
    } else if (calificacion >= 70) {
      System.out.println("La calificación es C.");
    } else if (calificacion >= 65) {
      System.out.println("La calificación es D.");
    } else {
      System.out.println("La calificación es E.");
    }
  }
}
