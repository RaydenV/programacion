
package ejercicios_brynt;

import java.util.Scanner;

public class Ejercicio31 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Ingrese la longitud del primer lado:");
    double a = sc.nextDouble();
    System.out.println("Ingrese la longitud del segundo lado:");
    double b = sc.nextDouble();
    System.out.println("Ingrese la longitud del tercer lado:");
    double c = sc.nextDouble();
     
    if (a == b && b == c) {
      System.out.println("El triángulo es equilátero.");
    } else if (a == b || a == c || b == c) {
      System.out.println("El triángulo es isósceles.");
    } else {
      System.out.println("El triángulo es escaleno.");
    }
  }
}