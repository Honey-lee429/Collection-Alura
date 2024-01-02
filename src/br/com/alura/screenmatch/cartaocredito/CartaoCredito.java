package br.com.alura.screenmatch.cartaocredito;

import br.com.alura.screenmatch.cartao.Compra;

import java.util.ArrayList;
import java.util.List;

public class CartaoCredito {

    private double limite;
    private double saldo;
    private List<CompraAlura> compras;

    public CartaoCredito(double limite) {
        this.limite = limite;
        this.saldo = limite;
        this.compras = new ArrayList<>();
    }

    public boolean lancaCompra(CompraAlura compra) {
        if(this.saldo > compra.getValor()){
            this.saldo -= compra.getValor();
            this.compras.add(compra);
            return true;
        }

        return false;
    }

    public double getLimite() {
        return limite;
    }

    public double getSaldo() {
        return saldo;
    }

    public List<CompraAlura> getCompras() {
        return compras;
    }
}
