public class PruebaVehiculos2 {
  public static void main(String[] args) {
    Vehiculos2[] vehiculos = new Vehiculos2[10]; // Crear un array para almacenar los vehículos
    int contador = 0; // Inicializar el contador de vehículos creados
  
  // Crear un vehículo de cada tipo
  Terrestres terrestreGenerico = new Terrestres("1234ABC", "Modelo 1");
  terrestreGenerico[contador++] = terrestreGenerico;
  
  Coche coche1 = new Coche("5678DEF", "Modelo 2", true, 4);
  vehiculos[contador++] = coche1;
  
  Moto moto1 = new Moto("9012GHI", "Modelo 3", contador, "Rojo");
  vehiculos[contador++] = moto1;
  
  Acuaticos acuaticoGenerico = new Acuaticos("JKLMN", "Modelo 4");
  vehiculos[contador++] = acuaticoGenerico;
  
  Barco barco1 = new Barco("OPQRSTU", "Modelo 5", true, 100);
  vehiculos[contador++] = barco1;
  
  Submarino submarino1 = new Submarino("VWXYZ01", "Modelo 6", false, 5000);
  vehiculos[contador++] = submarino1;
  
  Aereos aereoGenerico = new Aereos("ABCD123456", "Modelo 7");
  vehiculos[contador++] = aereoGenerico;
  
  Avion avion1 = new Avion("EFGH123456", "Modelo 8", 200);
  vehiculos[contador++] = avion1;
  
  Helicoptero helicoptero1 = new Helicoptero("IJKL123456", "Modelo 9", 2);
  vehiculos[contador++] = helicoptero1;
  
  // Recorrer el array y llamar al método imprimir de cada vehículo
  for (int i = 0; i < contador; i++) {
      vehiculos[i].imprimir();
  }
  Coche.combustible=("diesel");
  
  }
}
