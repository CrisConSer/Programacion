package Aereos;

public class Helicoptero extends Aereos {
  private int numeroHlices;

  public Helicoptero(String matricula, String modelo, int numeroAsientos, int numeroHlices) {
      super(matricula, modelo, numeroAsientos);
      this.numeroHlices = numeroHlices;
  }

  public int getNumeroHlices() {
      return numeroHlices;
  }

  public void setNumeroHlices(int numeroHlices) {
      this.numeroHlices = numeroHlices;
  }

  @Override
  public void imprimir() {
      System.out.printf("Helicóptero: matrícula=%s, modelo=%s, número de asientos=%d, número de hélices=%d\n",
              getMatricula(), getModelo(), getNumeroAsientos(), numeroHlices);
  }
}
