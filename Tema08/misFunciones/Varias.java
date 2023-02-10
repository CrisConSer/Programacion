package misFunciones;

public class Varias {

/**
  @param a primer numero 
  @param b segundo numero 
  @retur multiplicación de a*b
*/

  public static double multiplica(double a, double b) {
    double result;
    result = a*b;

    return result;
    }


/**
@info: funcion para mostrar si eres mayor de edad
@param a: introduce la edad
@return esMayorEdad: si a>18 entonces eres mayor de edad
*/

  public static boolean esMayorEdad (int a){

    if (a>=18){
      return true;
    }
      else{
        return false;
      }
    }

  public static int minimo(int a, int b){
    if (a<b){
      return a;
    }
    else{
      return b;
    }
}

/**
  @info: función para averiguar el signo de un número
  @param a: primer número
  @param b: segudno número
  @return dimeSigno:
    - "<0": el número es negativo
    - "=0": el número es igual a 0
    - ">0": el número es positivo
*/
public static int dimeSigno (int a){
  if(a==0){
    System.out.println("El número es cero");
  }
  if (a>0){
    System.out.println("El número es positivo");
  }
  if (a<0){
    System.out.println("El número es negativo");
  }
  return dimeSigno(a);
}

/**
@info: función para calcular la suma desde 1 a "n".
@param n: número "n".
@return suma: suma de los enteros de 1 a "n".
*/
  public static int suma1aN(int n){
// variable acumuladora
    int suma=0;
  // bucle
  for(int i=1; i<=n; i++){
    suma+=i;
  }

  return suma;
  }

/**
@info: función para calcular el producto de los factoriales desde 1 a "n".
@param n: número "n".
@return producto: producto resultante de todos los factoriales de 1 a "n".
*/

  public static int producto1aN(int n){
// variable para el resultado
    int producto=1;

// bucle para obtener el resultado del factorial n
    for(int i=1; i<=n; i++){
      producto*=i;
    }

// return
  return producto;
}

/**
@info: función para obtener el valor intermedio entre 1 y "n"
@param n: número "n"
@return intermedio: valor intermedio de los enteros de 1 a "n"
*/
  public static double intermedio1aN(int n){
// diferencia (números que se deben sumar a 1 para llegar a "n")
    int numeroMedio=0;

// cálculo de la diferencia
    for(int i=1; i<n; i++){
      numeroMedio++;
        }

// diferentes casos
    if(numeroMedio==0){
      return 0;
    }
    else if(numeroMedio==1){
      return 1;
    }
    else{
    double intermedio=(1+n)/2.0;
    return intermedio;
        }
  }

/**
@info: función para sacar el mayor de entre dos valores
@param:
  - "a": primer número
  - "b": segundo número
@return:
  - "a": el primer número es el mayor
  - "b": el segundo número es el mayor
*/
  public static int maximo(int a, int b){
    if(a>b){
      return a;
    }else{
      return b;
    }
  }
/**
    @info: función para imprimir un triángulo de n líneas
    @param:
      - "c": carácter a utilizar
      - "n": número de líneas
  */
  public static void printTriangulo(char c, int n){
    for(int i=1; i<=n; i++){
      for(int j=1; j<=n-i; j++){
        System.out.print(" ");
      }

      for(int j=1; j<=2*i-1; j++){
        System.out.print(c);
      }

      System.out.println();
    }
  }

/***************************************************/

/**
  @info: función para averiguar la letra del dni
  @param x: dni
  @return letra: letra 
*/
  public static char obtenerLetra(int dni){
    // resto del dni
      int resto = dni % 23;

    /***************/

    // variable para la letra
      char letra;

    /***************/

      switch(resto){
        case 0:
          letra='T';
        break;

        case 1:
          letra='R';
        break;

        case 2:
          letra='W';
        break;

        case 3:
          letra='A';
        break;

        case 4:
          letra='G';
        break;

        case 5:
          letra='M';
        break;

        case 6:
          letra='Y';
        break;

        case 7:
          letra='F';
        break;

        case 8:
          letra='P';
        break;

        case 9:
          letra='D';
        break;

        case 10:
          letra='X';
        break;

        case 11:
          letra='B';
        break;

        case 12:
          letra='N';
        break;

        case 13:
          letra='J';
        break;

        case 14:
          letra='Z';
        break;

        case 15:
          letra='S';
        break;

        case 16:
          letra='Q';
        break;

        case 17:
          letra='V';
        break;

        case 18:
          letra='H';
        break;

        case 19:
          letra='L';
        break;

        case 20:
          letra='C';
        break;

        case 21:
          letra='K';
        break;

        case 22:
          letra='E';
        break;

        default:
          letra=' ';
      }

    /***************/

    // return
      return letra;
  }

/***************************************************/

/**
  @info: función para imprimir un menú de dos opciones ("circunferencia" y "área")
  @return opcion: opción seleccionada
*/
  public static int menu(){
    // menú
      System.out.println("1. Circunferencia");
      System.out.println("2. Area");
      System.out.println("3. Volumen");
      System.out.println("4. Todas");
      System.out.println("5. Salir");
      System.out.print("\nElige una opción: ");

    /******************/

    // obtención de la opción
      Scanner opcionScanner=new Scanner(System.in);
        int opcion=opcionScanner.nextInt();

    /******************/

    // return
      return opcion;
  }

/***************************************************/

/**
  @info: función para obtener un radio y retornarlo
  @return radio: radio introducido
*/
  public static double pideRadio(){
    // print
      System.out.print("Introduce el radio: ");

    /******************/

    // obtención
      Scanner radioScanner=new Scanner(System.in);
        double radio=radioScanner.nextDouble();

    /******************/

    // return
      return radio;
  }
}



  
