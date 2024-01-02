package br.com.alura.screenmatch.cartao;

public class Cartao {

    private Double limite;
    public Compra compra;

    public Cartao(Double limite) {
        this.limite = limite;
    }

    public Double getLimite() {
        return this.limite -= this.compra.getTotal();
    }

    public void setLimite(Double limite) {
        this.limite = limite;
    }
}
