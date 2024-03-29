/*Ejercicio 9.Poo
 * @CConde
 */

public class Movil extends Terminal{
    // atributos
    private String tarifa;
    private double costeMinuto;
  
    /*********************************/
  
    // constructor
public Movil(String n, String t){
  super(n);
  
  this.tarifa=t;
    switch(t){
      case "rata":
        this.costeMinuto=0.06;
      break;
  
      case "mono":
        this.costeMinuto=0.12;
      break;
  
      case "bisonte":
        this.costeMinuto=0.3;
      break;
  
      default:
        this.costeMinuto=0;
      break;
    }
      }
  
    /*********************************/
  
    // métodos
      /**
        @Cconde
      */
@Override
  public void llama(Terminal t, int segundos){
    super.llama(t, segundos);
  
    double coste=this.costeMinuto*segundos/60.0;
  
    // no se debe imprimir nada aquí
  }
  
// método "toString" sobrecargado para incluir información de la tarifa y coste de llamada
  public String toString(){
    String costeStr=String.format("%.2f", costeMinuto);
    return "Nº "+getNumero()+" - "+getTiempoConversacion()+"s de conversación - Tarifa "+this.tarifa+" - Coste por minuto "+costeStr+" euros.";
    }
}