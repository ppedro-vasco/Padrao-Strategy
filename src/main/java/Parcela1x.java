public class Parcela1x implements ParcelaStrategy{
    int quantidadeParcela = 1;
    float taxaJuros = 1.0f;
    public float calcular(float valor){
        return (valor/quantidadeParcela) * taxaJuros;
    }
}
