package Tema08;

import Tema08.misFunciones.Varias;

import java.util.Scanner;

public class Ejercicio11{
  public static void name(String [] args) {
    Scanner s= new Scanner(System.in);

    System.out.println("Introduce un número: ");
      int numero=s.nextInt();

    System.out.println("*******************************");

    misFunciones.Varias(numero);
  }
}