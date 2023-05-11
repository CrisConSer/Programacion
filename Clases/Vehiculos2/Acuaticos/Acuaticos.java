public abstract class Acuaticos extends Vehiculos2 {
  private double eslora;

  public Acuaticos(String matricula, String modelo, double eslora) {
      super(matricula, modelo);
      this.eslora = eslora;
  }

  public double getEslora() {
      return eslora;
  }

  public void imprimir() {
      System.out.print("Matrícula: " + getMatricula() + " | Modelo: " + getModelo() + " | Eslora: " + eslora);
  }
}