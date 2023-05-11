public class Terminal {

  private String numero;
  private int tiempoConversacion;

  // constructor

  public Terminal (String n){
    this.numero = n;
    this.tiempoConversacion = 0;
  }
  
  // métodos

  public void llamar(Terminal t, int segundos){
    this.tiempoConversacion = tiempoConversacion + 1;
  }

  // metodo toString

  public String toStsString(){
    return "Nº " +this.numero + "s - " + this.tiempoConversacion+ " s de conversacion.";
  }
}
