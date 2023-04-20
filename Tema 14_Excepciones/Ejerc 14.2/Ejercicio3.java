/*Realiza un programa que genere una excepción de forma aleatoria de entre
las siguientes excepciones: NumberFormatException, IOException, FileNotFoundException,
IndexOutOfBoundsException y ArithmeticException.
Author: Cristina Conde
@CrisConSer 
 */

import java.io.FileNotFoundException;
import java.io.IOException;

public class Ejercicio3 {

    // Ponemos el throws importando las clases 
    public static void main(String[] args) throws FileNotFoundException, IOException {

        int id=(int)(Math.random()*5+1);

        switch (id) {
            case 1:
                throw new NumberFormatException(); // formato numérico inválido
            case 2:
                throw new IOException(); // Error de entrada/salida
            case 3:
                throw new FileNotFoundException(); // Archivo no encontrado
            case 4:
                throw new IndexOutOfBoundsException(); // Índice fuera de los límites
            case 5:
                throw new ArithmeticException();// Error aritmético
            default:
            System.out.println("Fin del programa");
        }
    }
}


