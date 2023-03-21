public class PruebaGatosDos {
  public static void main(String[] args) {
    // creacion de Arrays para 4 gatos
    GatoDos[] misis = new GatoDos[4];
    
    // Generamos instancias
    misis [0] = new GatoDos("Tom", "Negro", "Persa", 1, 5.5);
    misis [1] = new GatoDos("Jerry", "Blanco", "Siames", 3 , 4.5);
    misis [2] = new GatoDos("Genry", "Marron y blanco","ragdoll" , 7, 5.78);
    misis [3] = new GatoDos("Jimmy", "Blanco y negro", "Angora", 3, 4.10);

    // info de todos los gatos
    for(int i=0; i<4; i++){
      System.out.println(misis[i].toSTString(i+1));
    }
  }
}
