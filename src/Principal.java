import br.com.alura.screenmatch.calculos.CalculadoraDeTempo;
import br.com.alura.screenmatch.calculos.FiltroRecomendacao;
import br.com.alura.screenmatch.modelos.Episodio;
import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Serie;
import br.com.alura.screenmatch.modelos.Titulo;

import java.util.ArrayList;
import java.util.List;

public class Principal {
    public static void main(String[] args) {
        Filme meuFilme = new Filme();
        meuFilme.setNome("O poderoso chefão");
        meuFilme.setAnoDeLancamento(1970);
        meuFilme.setDuracaoEmMinutos(180);
        meuFilme.avalia(8);
        System.out.println("Duração do filme: " + meuFilme.getDuracaoEmMinutos());
        meuFilme.exibeFichaTecnica();
        System.out.println("Total de avaliações: " + meuFilme.getTotalDeAvaliacoes());
        System.out.println(meuFilme.pegaMedia());
        //meuFilme.somaDasAvaliacoes = 10;
        //meuFilme.totalDeAvaliacoes = 1;
        //System.out.println(meuFilme.pegaMedia());

        Serie lost = new Serie();
        lost.setNome("Lost");
        lost.setAnoDeLancamento(2000);
        lost.exibeFichaTecnica();
        lost.setTemporadas(10);
        lost.setEpisodiosPorTemporada(10);
        lost.setMinutosPorEpisodio(50);
        System.out.println("Duração para maratonar Lost: " + lost.getDuracaoEmMinutos());

        Filme outroFilme = new Filme();
        outroFilme.setNome("Avatar");
        outroFilme.setAnoDeLancamento(2023);
        outroFilme.setDuracaoEmMinutos(200);
        outroFilme.avalia(10);

        var it = new Filme();
        it.setNome("it");
        it.setAnoDeLancamento(2015);
        it.setDuracaoEmMinutos(205);

        CalculadoraDeTempo calculadora = new CalculadoraDeTempo();
        calculadora.inclui(meuFilme);
        calculadora.inclui(outroFilme);
        calculadora.inclui(lost);
        System.out.println(calculadora.getTempoTotal());

        FiltroRecomendacao filtro = new FiltroRecomendacao();
        filtro.filtra(meuFilme);

        var episodio = new Episodio();
        episodio.setNumero(1);
        episodio.setSerie(lost);
        episodio.setTotalVisualizacoes(300);
        filtro.filtra(episodio);


        ArrayList<Titulo> lista = new ArrayList<>();
        lista.add(meuFilme);
        lista.add(it);
        lista.add(outroFilme);
        lista.add(lost);

        System.out.println("lista " + lista.toString());

        lista.forEach(titulo -> System.out.println(titulo.getNome()));
        lista.forEach(System.out::println);

        for (Titulo item : lista) {
            System.out.println("for each " + item.getNome());
            Filme filme = (Filme) item;
            // var f = new Filme(); não tem referencia
            System.out.println("classificacao " + filme.getClassificacao());
            // solta uma java.lang.ClassCastException pois não compila a classe Serie
        }
       // resolvendo a Exception ClassCastException
        for (Titulo item : lista) {
            System.out.println("for each " + item.getNome());
            if (item instanceof Filme filme && filme.getClassificacao() > 2) {
                System.out.println("classificacao " + filme.getClassificacao());
            }

        }

        // var notas = new ArrayList<>(); //Generics(jdk 5) - Diamont Operator(jdk 7)
        List<Double> notas = new ArrayList<>();
        notas.add(7d);
        notas.add(8d);
        notas.add(6.7);
        notas.add(3.5);
        System.out.println(notas);
    }
}