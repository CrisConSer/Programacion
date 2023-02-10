/**
Escribe un programa que cree un array de tamaño 100, con los primeros
100 numeros. Luego muestra la suma total y la meda. Suma de un array y 
otra que calcule la media de un array.
*/

package Tema08;

import Tema08.misFunciones.Arrays;

import java.util.Scanner;

public class Ejercicio15{
  public static void main(String[] args){
    // tamaño array
      
        Scanner s = new Scanner(System.in);

        /*****************/

        System.out.print("Introduce el tamaño del array a generar: ");
            int t=s.nextInt();

          System.out.println("************************");

      for(int i=0; i<t; i++){
        System.out.print(FunciArray.arrayNaturales );
      }

      System.out.print("|");
  }
}