/*Realiza un programa que pida 6 números por teclado y nos diga cuál es el
máximo. Si el usuario introduce un dato erróneo (algo que no sea un número
entero) el programa debe indicarlo y debe pedir de nuevo el número.
Author: Cristina Conde
@CrisConSer 
 */

import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) 

        Scanner s = new Scanner(System.in);
        int max = Integer.MIN_VALUE;
        int num;

        System.out.println("Por favor, inserta 6 números: ");

        for (int i = 0; i < 6; i++) {
          // aplicamos la excepcion try and catch
            try {
                num = s.nextInt();
                if (num > max) {
                    max = num;
                }
            } catch (Exception e) {
                System.out.println("Entrada no válida. Por favor, indica otro número");
                s.nextLine(); 
                i--; 
            }
        }

        System.out.println("El número máximo es: " + max);

        //cierra la clase scanner
        s.close();
    }
}