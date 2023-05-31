public class Parcela6x implements ParcelaStrategy{
    int quantidadeParcela = 6;
    float taxaJuros = 1.12f;
    public float calcular(float valor){
        return (valor/quantidadeParcela) * taxaJuros;
    }
}
