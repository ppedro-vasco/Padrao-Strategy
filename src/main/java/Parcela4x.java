public class Parcela4x implements ParcelaStrategy{
    int quantidadeParcela = 4;
    float taxaJuros = 1.08f;
    public float calcular(float valor){
        return (valor/quantidadeParcela) * taxaJuros;
    }
}
