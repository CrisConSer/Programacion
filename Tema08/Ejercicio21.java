/**
 * Ejercicio21
 * Escribe un programa que muestre un número con 2 opciones:
 * 1.-Circunsferencia 2.- Area
 * En ambas opciones pedirá al usuario que introduzca un radio y se 
 * mostrará el cáculo oportuno.
 * @CConde
 */

 package Tema08;

import java.util.Scanner;

import misFunciones.Varias;

public class Ejercicio21 {

/**
  @info: función para generar un array
  @return:
          x = numero de elementos del array
          y= numero mayor
          z= numero menor  
*/

  public static int[] generaArrayInt(int x, int y, int z){
    int t=x;

    int[] array=new int[t];

// asignación de valores
    for(int i=0; i<t; i++){
      array[i]=(int)(Math.random()*(z-y+1)+y);
    }
    return array;
  }

/**
  @info: función para obtener el minimo de array
  @return valorMin: retorna el valor mínimo 
*/
  public static int minimoArrayInt(int[] x){
    int valorMin=Integer.MAX_VALUE;

      for(int i=0; i<x.length; i++){
        if(x[i]<valorMin){
          valorMin=x[i];
        }
      }

    return valorMin;
    }

  public static void main(String[] args){
      // scanner
    Scanner s=new Scanner(System.in);
    System.out.print("Introduce el número de elementos que debe tener el array: ");
      int ele=s.nextInt();

        // intervalo menor
    System.out.print("Introduce el valor mínimo del intervalo de los valores: ");
      int min=s.nextInt();

        // intervalo menor
    System.out.print("Introduce el valor máximo del intervalo de los valores: ");
      int max=s.nextInt();


      // almacenar el array y crear nuevo
    int[] arrayGuardado=new int[ele];

    for(int i=0; i<ele; i++){
      arrayGuardado[i]=generaArrayInt(ele, min, max)[i];
    }


    System.out.println("");

      for(int i=0; i<ele; i++){
        System.out.printf("| %-5d", arrayGuardado[i]);
      }

      System.out.println(" |");


      // mínimo
        System.out.print("\nEl valor mínimo de este array es el "+minimoArrayInt(arrayGuardado)+".");
  }
}
