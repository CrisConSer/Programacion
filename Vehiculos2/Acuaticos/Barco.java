package Acuaticos;

public class Barco extends Acuaticos {
  private boolean tieneMotor;

  public Barco(String matricula, String modelo, double eslora, boolean tieneMotor) {
      super(matricula, modelo, eslora);
      this.tieneMotor = tieneMotor;
  }

  public boolean isTieneMotor() {
      return tieneMotor;
  }

  public void setTieneMotor(boolean tieneMotor) {
      this.tieneMotor = tieneMotor;
  }

  @Override
  public void imprimir() {
      String motor = tieneMotor ? "con motor" : "sin motor";
      System.out.printf("Barco: matrícula=%s, modelo=%s, eslora=%.2f metros, %s\n", getMatricula(), getModelo(),
              getEslora(), motor);
  }
}
