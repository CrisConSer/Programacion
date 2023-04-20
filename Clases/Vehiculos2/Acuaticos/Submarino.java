public class Submarino extends Acuaticos {
    private int profundidadMaxima;

    public Submarino(String matricula, String modelo, double eslora, int profundidadMaxima) {
        super(matricula, modelo, eslora);
        this.profundidadMaxima = profundidadMaxima;
    }

    public int getProfundidadMaxima() {
        return profundidadMaxima;
    }

    public void setProfundidadMaxima(int profundidadMaxima) {
        this.profundidadMaxima = profundidadMaxima;
    }

    @Override
    public void imprimir() {
        System.out.printf("Submarino: matrícula=%s, modelo=%s, eslora=%.2f metros, profundidad máxima=%d metros\n",
                getMatricula(), getModelo(), getEslora(), profundidadMaxima);
    }
}
