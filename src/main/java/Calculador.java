public class Calculador {
    private float valor;

    public Calculador(float valor){
        this.valor = valor;
    }

    public float calcular(ParcelaStrategy strategy){
        return strategy.calcular(valor);
    }
}
