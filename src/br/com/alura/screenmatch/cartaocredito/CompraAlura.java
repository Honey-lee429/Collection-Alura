package br.com.alura.screenmatch.cartaocredito;

public class CompraAlura implements Comparable<CompraAlura>{
    private String descricao;
    private double valor;

    public CompraAlura(String descricao, double valor) {
        this.descricao = descricao;
        this.valor = valor;
    }

    public String getDescricao() {
        return descricao;
    }

    public double getValor() {
        return valor;
    }

    @Override
    public String toString() {
        return "Compra: descricao = " + descricao +
                " valor =" + valor;
    }

    @Override
    public int compareTo(CompraAlura outraCompra) {
        return Double.valueOf(this.valor).compareTo(Double.valueOf(outraCompra.valor));
    }
}
