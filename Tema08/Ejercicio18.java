/**
 * Ejercicio18
 * Programa que pida el DNI y muestre por pantalla letra asociada.
 * @CConde
 */
package Tema08;

import misFunciones.Varias;
import java.util.Scanner;

public class Ejercicio18 {

  public static void main(String[] args){
    // dni
    Scanner s=new Scanner(System.in);

    System.out.print("Introduce tu número de DNI: ");
      int dni=s.nextInt();

      char letra=misFunciones.Varias.obtenerLetra(dni);

      System.out.println("Tu NIF es: "+dni+letra+".");
  }
}
