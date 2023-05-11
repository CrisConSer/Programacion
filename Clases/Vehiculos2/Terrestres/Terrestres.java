import programacion.Vehiculos2.Vehiculos2;

public abstract class Terrestres extends Vehiculos2 {
  private int numRuedas;

  public Terrestres(String matricula, String modelo, int numRuedas) {
      super(matricula, modelo);
      this.numRuedas = numRuedas;
  }

  public int getNumRuedas() {
      return numRuedas;
  }

  @Override

  public void imprimir() {
      System.out.print("El número de rueda es de: " + this.numRuedas + "con número de matrícula:" + this.getMatricula);
  }
}