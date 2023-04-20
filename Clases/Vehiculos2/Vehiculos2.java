public abstract class Vehiculos2 {
  private String matricula;
  private String modelo;

  public Vehiculos2(String matricula, String modelo) {
      this.matricula = matricula;
      this.modelo = modelo;
  }

  public String getMatricula() {
      return matricula;
  }

  public String getModelo() {
      return modelo;
  }

  public abstract void imprimir();
}