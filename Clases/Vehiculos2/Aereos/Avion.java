package Aereos;

public class Avion extends Aereos {
  private int tiempoMaximoVuelo;

  public Avion(String matricula, String modelo, int numeroAsientos, int tiempoMaximoVuelo) {
      super(matricula, modelo, numeroAsientos);
      this.tiempoMaximoVuelo = tiempoMaximoVuelo;
  }

  public int getTiempoMaximoVuelo() {
      return tiempoMaximoVuelo;
  }

  public void setTiempoMaximoVuelo(int tiempoMaximoVuelo) {
      this.tiempoMaximoVuelo = tiempoMaximoVuelo;
  }

  @Override
  public void imprimir() {
      System.out.printf("Avión: matrícula=%s, modelo=%s, número de asientos=%d, tiempo máximo de vuelo=%d horas\n",
              getMatricula(), getModelo(), getNumeroAsientos(), tiempoMaximoVuelo);
  }
}

