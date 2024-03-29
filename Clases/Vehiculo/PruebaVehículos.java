

/**
 * 2. Crea la clase Vehiculo , así como las clases Bicicleta y Coche
 *    como subclases de la primera. Para la clase Vehiculo , crea los
 *    atributos de clase vehiculosCreados y kilometrosTotales , así como
 *    el atributo de instancia kilometrosRecorridos . Crea también algún
 *    método específico para cada una de las subclases. Prueba las
 *    clases creadas mediante un programa con un menú como el que se
 *    muestra a continuación:
 *    VEHÍCULOS
 *    =========
 *    1. Anda con la bicicleta
 *    2. Haz el caballito con la bicicleta
 *    3. Anda con el coche
 *    4. Quema rueda con el coche
 *    5. Ponte de pie en la bicicleta
 *    6. Toca el timbre
 *    7. Ver kilometraje de la bicicleta
 *    8. Ver kilometraje del coche
 *    9. Ver kilometraje total
 *    10. Salir
 *    Elige una opción (1-10):
 * 
 *@CConde
 */

public class PruebaVehículos {
  public static void main(String[] args) {

    int opcion = 0;
    int km;
    
    Bicicleta bhSpeedrom = new Bicicleta(11);
    Coche saab93 = new Coche(1900);

    while (opcion != 10) {
      System.out.println("\n1. Anda con la bicicleta");
      System.out.println("2. Haz el caballito con la bicicleta");
      System.out.println("3. Anda con el coche");
      System.out.println("4. Quema rueda con el coche");
      System.out.println("5. Ponte de pie en la bicicleta");
      System.out.println("6. Toca el timbre");
      System.out.println("7. Ver kilometraje de la bicicleta");
      System.out.println("8. Ver kilometraje del coche");
      System.out.println("9. Ver kilometraje total");
      System.out.println("10. Salir");
      System.out.println("Elige una opción (1-8): ");
      
      opcion = Integer.parseInt(System.console().readLine());
      
      switch (opcion) {
        case 1:
          System.out.print("¿Cuántos kilómetros quiere recorrer? ");
          km = Integer.parseInt(System.console().readLine());
          bhSpeedrom.recorre(km);
          break;
        case 2:
          bhSpeedrom.hazCaballito();
          break;
        case 3:
          System.out.print("¿Cuántos kilómetros quiere recorrer? ");
          km = Integer.parseInt(System.console().readLine());
          saab93.recorre(km);
          break;
        case 4:
          saab93.quemaRueda();
          break;
        case 5:
        bhSpeedrom.pontePie();
        break;
        case 6:
        bhSpeedrom.timbre();
        break;
        case 7:
          System.out.print("La bicicleta lleva recorridos ");
          System.out.println(bhSpeedrom.getKilometrosRecorridos() + " Km");
          break;
        case 8:
          System.out.print("El coche lleva recorridos ");
          System.out.println(saab93.getKilometrosRecorridos() + " Km");
          break;
        case 9:
          System.out.print("Los vehículos llevan recorridos ");
          System.out.println(Vehiculo.getKilometrosTotales() + " Km");
        default:
      } // switch
    } // while
  }
}
