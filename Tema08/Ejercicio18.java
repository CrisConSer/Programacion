/**
 * Ejercicio18
 * Programa que pida el DNI y muestre por pantalla letra asociada.
 * @CConde
 */

import Tema08.misFunciones.Varias;
import java.util.Scanner;

public class Ejercicio18 {

  public static void main(String[] args){
    // dni
      // scanner
        Scanner s=new Scanner(System.in);

        /***************/

        // obtención
          System.out.print("Introduce tu número de DNI: ");
            int dni=s.nextInt();

        /***************/

      // cierre de scanner
        s.close();

    /***************************************/

    // debug
      char letra=misFunciones.Varias.obtenerLetra(dni);

      System.out.println("Tu NIF es: "+dni+letra+".");
  }
}


  
}
