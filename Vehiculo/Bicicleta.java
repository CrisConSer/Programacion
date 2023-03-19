public class Bicicleta extends Vehiculo {
  private int pinones; // número de piñones
  
  public Bicicleta(int p) {
    super();
    this.pinones = p;
  }

  public void hazCaballito() {
    System.out.println("Estoy haciendo el caballito");
  }

  public void pontePie() {
    System.out.println("Estoy de pie en la bici, yujuuuuuu");
  }

  public void timbre() {
    System.out.println("Aparten que voy");
  }
}
