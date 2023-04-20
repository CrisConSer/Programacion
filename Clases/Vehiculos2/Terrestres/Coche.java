public class Coche extends Terrestres {
  private boolean aireAcondicionado;

// constructor
  public Coche(String matricula, String modelo, boolean aireAcondicionado, int numRuedas) {
      super(matricula, modelo, numRuedas);
      this.aireAcondicionado = aireAcondicionado;
  }
  // Creación de método getter
  public boolean getAireAcondicionado() {
      return aireAcondicionado;
  }

  // Realizar el metodo imprimit para imprimir todo lo realicionado con el coche
  public void imprimir() {
      System.out.print("Matrícula: " + getMatricula() + " | Modelo: " + getModelo() + " | Número de ruedas: " + getNumRuedas() + " | Aire acondicionado: " + aireAcondicionado);
  }

  // Realizar metodo echar gasolina

  public void gasolina(String combustible){
    if(combustible.equals("diesel")){
      System.out.println("Genial, combustible correcto");
    }
    else{
      System.out.println("Cuidado, tu coche no es diesel");
    }
  }
}