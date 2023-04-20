abstract class Aereo extends Vehiculos2 {
  private int numAsientos;

  public Aereo(String matricula, String modelo, int numAsientos) {
      super(matricula, modelo);
      this.numAsientos = numAsientos;
  }

  public int getNumAsientos() {
      return numAsientos;
  }

  public void imprimir() {
      System.out.print("Matrícula: " + getMatricula() + " | Modelo: " + getModelo() + " | Número de asientos: " + numAsientos);
  }
}
