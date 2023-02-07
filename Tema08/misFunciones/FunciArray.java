/*FunciaArray.java
*Realizar una biblioteca con funciones sobre Arrays
*@CConde
*/

public class FunciArray {

/**
  @infor: funcion para generar arrays con numero aletorios
  @param: t= tamaño, min= numero minimo y max= numero maximo
  @return:arrays con numeros aleatorios
*/
    public static int[] generaArrayInt(int t, int min, int max) {
        int[] array = new int[t];
        for (int i = 0; i < t; i++) {
            array[i] = (int)(Math.random() * (max - min + 1) + min);
        }
        return array;
    }
    
/**
  @infor: funcion para generar arrays indicando en número minimo de arrays
  @param: array
  @return:genera arrays
*/
    public static int minimoArrayInt(int[] array) {
        int minimo = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] < minimo) {
                minimo = array[i];
            }
        }
        return minimo;
    }


/**
  @infor: funcion para generar arrays indicando en número minimo de arrays
  @param: array
  @return:genera arrays
*/
    public static int maximoArrayInt(int[] array) {
        int maximo = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > maximo) {
                maximo = array[i];
            }
        }
        return maximo;
    }

/**
    @info: función para obtener la media del array
    @param:
    - "int[] x": array
    - "y": nº de elementos totales del array
    @return media: media del array
*/
    public static int mediaArrayInt(int[] x, int y){
        int suma=0;

        for(int i=0; i<y; i++){
            suma+=x[i];
        }

        int media=suma/y;
        return media;
    }


/**
    @info: función para comprobar si un número está en el array
    @param:
    - "int[] x": array
    - "y": valor a encontrar en el array
    @return:
    - "true": el valor se encuentra en el array
    - "false": el valor no se encuentra en el array
  */
    public static boolean estaEnArrayInt(int[] x, int y){
        boolean esta=false;

        for(int i=0; i<x.length; i++){
            if(x[i]==y){
            return true;
        }
    }
    return esta;
    }


/**
    @info: función para obtener la posición de un valor en el array
    @param:
    - "int[] x": array
    - "y": valor a encontrar en el array
    @return pos: posición del valor en el array
  */
    public static int posicionEnArray(int[] x, int y){
      int pos=0;

        for(int i=0; i<x.length; i++){
          if(x[i]==y){
            pos=i;
          }
        } 
        return pos;
    }


/**
    @info: función para obtener el array de forma invertida
    @param
    - "int[] x": array a invertir
    - "y": nº de elementos del array
    @return arrayInvertido: array invertido
  */
    public static int[] volteaArrayInt(int[] x, int y){
 // array invertido
      int[] arrayInvertido=new int[y];

// variable auxiliar
      int j=0;

// guardando los valores de forma inversa
      for(int i=y-1; i>=0; i--){
        arrayInvertido[j]=x[i];
        j++;
      }
    return arrayInvertido;
    }


/**
    @info: función para rotar n posiciones a la derecha el array
    @param:
    - "int[] x": array
    - "y": nº de elementos del array
    - "z": nº de posiciones a rotar
    @return arrayDerecha: array rotado n posiciones a la derecha
*/
    public static int[] rotaDerechaArrayInt(int[] x, int y, int z){
      int[] arrayDerecha=new int[y];

      for(int i=0; i<y; i++){
        arrayDerecha[(i+z)%y]=x[i];// el módulo calcula la nueva posición que debe obtener el valor en la posición actual, es decir, el elemento con posición "[(i+z)%y]" es igual al valor con posición 0 del array original, y así sucesivamente
      }

      return arrayDerecha;
    }


/**
    @info: función para rotar n posiciones a la izquierda el array
    @param:
    - "int[] x": array
    - "y": nº de elementos del array
    - "z": nº de posiciones a rotar
    @return arrayIzquierda: array rotado n posiciones a la izquierda
*/
    public static int[] rotaIzquierdaArrayInt(int[] x, int y, int z){
      int[] arrayIzquierda=new int[y];

      for(int i=0; i<y; i++){
      arrayIzquierda[i]=x[(i+y-z)%y];// el módulo se encarga de calcular el índice exacto donde se debe colocar el valor del array original, de forma similar a la función anterior. se suma el índice actual y la longitud total del array para obtener la posición del elementos después de rotar todo el array hacia la izquierda una vez, que añadiendo el nº de rotaciones ("z"), da como resultado la posición después de rotar "z" veces hacia la izquierda
      }

      return arrayIzquierda;
    }


/**
    @info: función para array de los primeros número naturales
    @param x: tamaño del array
    @return arrayNaturales: array de los primeros números naturales
*/
    public static int[] arrayNaturales(int x){
    int[] arrayNaturales=new int[x];

// variable auxiliar  
    int aux=0;

      for(int i=1; aux<x; i++){
        arrayNaturales[aux]=i;

        aux++;
      }

      return arrayNaturales;
    }
}





