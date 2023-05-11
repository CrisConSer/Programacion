public class Moto extends Terrestres {
  private String color;

  public Moto(String matricula, String modelo, int numRuedas, String color) {
      super(matricula, modelo, numRuedas);
      this.color = color;
  }

  public String getColor() {
      return color;
  }

  @Override
  public void imprimir() {
      System.out.println("Moto - Matrícula: " + getMatricula() + ", Modelo: " + getModelo() + ", Número de ruedas: " + getNumRuedas() + ", Color: " + color);
  }
}