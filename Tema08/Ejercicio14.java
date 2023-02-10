/**
 * Programa para crear una una pirámide.
 * @CConde
*/

package Tema08;

import Tema08.misFunciones.Varias;

import java.util.Scanner;

public class Ejercicio14 {
  public static void main (String [] args){

    Scanner s = new Scanner(System.in);

    // caracter
    System.out.print("Introduce el carácter a utilizar para la piramide: ");
    char caracter = s.next().charAt(0);

    // altura

    System.out.print("Introduce la altura de la pirámide: ");
    int altura=s.nextInt();

    System.out.println("**************************");

    Varias.
    

  


}







   
        /***************/

        // carácter
          System.out.print("Introduce el carácter a utilizar para imprimir el triángulo: ");
            char c=s.next().charAt(0);

        // nº de líneas
          System.out.print("Introduce el número de líneas que debe tener el triángulo: ");
            int n=s.nextInt();

          System.out.println();

        /***************/

      // cierre scanner
        s.close();

    /*****************************************/

    // debug
      Varias.printTiangulo(c,n);
  }
}
