public class Parcela5x implements ParcelaStrategy{
    int quantidadeParcela = 5;
    float taxaJuros = 1.1f;
    public float calcular(float valor){
        return (valor/quantidadeParcela) * taxaJuros;
    }
}
