public class Parcela2x implements ParcelaStrategy{
    int quantidadeParcela = 2;
    float taxaJuros = 1.02f;
    public float calcular(float valor){
        return (valor/quantidadeParcela) * taxaJuros;
    }
}
