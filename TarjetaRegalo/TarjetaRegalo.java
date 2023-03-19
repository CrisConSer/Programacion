public class TarjetaRegalo {
    // atributos
    private double saldo;
    private String digitos;
  
    /****************************/
  
    // constructor
public TarjetaRegalo(double s){
  this.saldo=s;
  
  this.digitos="";
    for(int i=0; i<5; i++){
      this.digitos+=(int)(Math.random()*10);
      
}
  
    /****************************/
  
// métodos
  // getter para obtener los 5 dígitos de una tarjeta
    public String getDigitos(){
      return new String (digitos);
    }
  
  /***************/
  
  /**
    @info: método para registrar un gasto en una tarjeta
    @param g: total a gastar
  */
public void gasta(double g){
  if(g>this.saldo){// si el gasto es mayor que el saldo
    System.out.println("No tienes suficiente saldo para gastar "+String.format("%.2f", g)+" euros");
  }else{
    this.saldo-=g;
  }
}
  
/***************/
  
// getter para obtener el saldo
  public double getSaldo(){
  return saldo;
  }
  
      /***************/
  
/// método "toString"
public String toString() {
  return "Tarjeta nº " + getDigitos() + " - Saldo " + String.format("%.2f", getSaldo()) + " euros";
}
  
/***************/
  
/**
  @info: método para fusionar dos tarjetas y crear una nueva a partir de ellas
  @param t: tarjeta a fusionar
*/
  public TarjetaRegalo fusionaCon(TarjetaRegalo t){
    double nuevoSaldo=this.saldo+t.getSaldo();
  
    this.saldo=0;
    t.saldo=0;
  
  return new TarjetaRegalo(nuevoSaldo);
  }
  } 
}
