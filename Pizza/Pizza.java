/**
Crea la clase Pizza con los atributos y métodos necesarios. Sobre cada pizza
se necesita saber el tamaño - mediana o familiar - el tipo - margarita, cuatro
quesos o funghi - y su estado - pedida o servida. La clase debe almacenar
información sobre el número total de pizzas que se han pedido y que se
han servido. Siempre que se crea una pizza nueva, su estado es “pedida”
@CConde
*/

public class Pizza{
  // atributos
    private String tipo;
    private String tamano;
    private String estado;

    // total pedidas y servidas
    private static int totalPedidas=0;
    private static int totalServidas=0;

  /************************************************/

  // constructor
    public Pizza(String tipo, String tamano){
        this.tipo=tipo;

        this.tamano=tamano;

        this.estado="pedida.";

        this.totalPedidas++;// se incrementa el total de pizzas pedidas al crear una nueva instancia de la clase "Pizza"
    }

  /************************************************/

  // métodos
    // "getTipo"
      public String getTipo(){
        return tipo;
      }

    /**********************/

    // "getTamano"
      public String getTamano(){
        return tamano;
      }

    /**********************/

    // "getEstado"
      public String getEstado(){
        return estado;
      }

    /**********************/

    // "getTotalPedidas"
      public static int getTotalPedidas(){
        return totalPedidas;
      }

    /**********************/

    // "getTotalServidas"
      public static int getTotalServidas(){
        return totalServidas;
      }

    /**********************/

    // sirve una pizza
      public void sirve(){
        if(this.estado.equals("pedida.")){
          this.estado="servida.";

          this.totalServidas++;
        }
      }

  /************************************************/

  // sobreescritura del método "toString" para imprimir información sobre la instancia de "Pizza"
    @Override
      public String toString() {
        return "Pizza "+this.tipo+" "+this.tamano+", "+this.estado;
      }
}