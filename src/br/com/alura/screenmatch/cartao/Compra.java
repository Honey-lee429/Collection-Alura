package br.com.alura.screenmatch.cartao;

import java.util.List;

public class Compra {

    private double total;

    private String descricao;
    private List cesta;

    public Compra(double total) {
        this.total = total;
    }

    public double getTotal() {
        return this.total++;
    }

    public List getCesta() {
        return cesta;
    }
}
