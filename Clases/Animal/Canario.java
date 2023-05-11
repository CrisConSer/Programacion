public class Canario extends Animal {
  private String color; // color pajajo
  
  public Canario(int c) {
    super();
    this.color = c;
  }

  public void vuela() {
    System.out.println("Estoy haciendo el caballito");
  }

  public void canta(){
    System.out.print("Amanece y empieza a cantar");
  }

  public void posa(){
    System.out.print("Pósate en un un arbol");
  }
}

