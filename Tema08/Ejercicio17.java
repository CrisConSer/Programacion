/**
 * Ejercicio17
 * Programa para pedir números enteros hasta que se introduzca un 0
 * cada número introducido nos dirá si es o no primo.
 * @CConde
 */
import java.util.Scanner;

import misFunciones.Varias;

public class Ejercicio17 {
  public static void main(String[] args){
    int num=1;

    Scanner s =new Scanner(System.in);
      
    do{

      System.out.print("Introduce un número: ");
      num=s.nextInt();


      if(misFunciones.Varias.esPrimo(num)){
        System.out.println("El número "+num+" es primo.");
      }else{
        System.out.println("El número "+num+" no es primo.");
      }
    }while(num!=0);

    System.out.print("\nEl número introducido es un 0, por lo que termina el programa.");
  }
}
