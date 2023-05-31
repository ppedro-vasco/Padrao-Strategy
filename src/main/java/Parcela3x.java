public class Parcela3x implements ParcelaStrategy{
    int quantidadeParcela = 3;
    float taxaJuros = 1.04f;
    public float calcular(float valor){
        return (valor/quantidadeParcela) * taxaJuros;
    }
}
