public class Cliente {
    private float valorCompra;

    public float getValorCompra(){
        return valorCompra;
    }

    public void calcularParcela1x(float valor){
        Calculador calculador = new Calculador(valor);
        this.valorCompra = calculador.calcular(new Parcela1x());
    }
    public void calcularParcela2x(float valor){
        Calculador calculador = new Calculador(valor);
        this.valorCompra = calculador.calcular(new Parcela2x());
    }
    public void calcularParcela3x(float valor){
        Calculador calculador = new Calculador(valor);
        this.valorCompra = calculador.calcular(new Parcela3x());
    }
    public void calcularParcela4x(float valor){
        Calculador calculador = new Calculador(valor);
        this.valorCompra = calculador.calcular(new Parcela4x());
    }
    public void calcularParcela5x(float valor){
        Calculador calculador = new Calculador(valor);
        this.valorCompra = calculador.calcular(new Parcela5x());
    }
    public void calcularParcela6x(float valor){
        Calculador calculador = new Calculador(valor);
        this.valorCompra = calculador.calcular(new Parcela6x());
    }
}
