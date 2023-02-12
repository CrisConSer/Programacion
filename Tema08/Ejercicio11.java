/**
 * Programa pra que escrib la tabla de multiplicar introduciendo un número
 * @CConde
 */

package Tema08;

import misFunciones.Varias;

import java.util.Scanner;

public class Ejercicio11{
  public static void name(String [] args) {
    Scanner s= new Scanner(System.in);

    System.out.println("Introduce un número: ");
      double numero=s.nextDouble();

    System.out.println("*******************************");

    misFunciones.Varias.multiplica(numero);
  }
}
