package br.com.alura.screenmatch.cartao;

import java.util.Scanner;

public class Service {

    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);

        // definindo limite do cartão
        System.out.println("limite do cartao: ");
        Double limite = leitura.nextDouble();
        var cartao = new Cartao(limite);

        // Iniciando compra
        String l = "s";
        while (l.equals("s")) {
            System.out.println("descricao item: ");
            leitura.next();

            System.out.println("valor do item: ");
            double v = leitura.nextDouble();
            var compra = new Compra(v);
            double b = 0;
            b = compra.getTotal() + b;


            System.out.println("continuar comprando? digite s para sim ou n para nao");
            l = leitura.next();
            if (l.equals("n")) {
                System.out.println("compra finalizada");
                System.out.println("total R$ " + b);

            }


        }




    }
}
