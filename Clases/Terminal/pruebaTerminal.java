public class pruebaTerminal{
  public static void main(String[] args){
    // instancias
      Terminal t1=new Terminal("678 11 22 33");
      Terminal t2=new Terminal("644 74 44 69");
      Terminal t3=new Terminal("622 32 89 09");
      Terminal t4=new Terminal("664 73 98 18");

    /******************************/

    // output
      System.out.println(t1);
      System.out.println(t2);

      // aumento de los segundos de conversación del primer, segundo y tercer terminal
        t1.llamar(t2, 320);
        t1.llamar(t3, 200);

      System.out.println(t1);
      System.out.println(t2);
      System.out.println(t3);
      System.out.print(t4);
  }
}