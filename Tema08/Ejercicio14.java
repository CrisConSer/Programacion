/**
 * Programa para crear una una pirámide.
 * @CConde
*/

package Tema08;

import Tema08.misFunciones.Varias;

import java.util.Scanner;

public class Ejercicio14 {
  public static void main (String [] args){

    Scanner s= new Scanner (System.in);

    // caracter
    System.out.print("Introduce el carácter a utilizar para la piramide: ");
    char caracter = s.next().charAt(0);

    // altura

    System.out.print("Introduce la altura de la pirámide: ");
    int altura=s.nextInt();

    System.out.println("**************************");

    misFunciones.Varias.printTriangulo(caracter, altura);
  }
}