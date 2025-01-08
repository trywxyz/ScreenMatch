import br.com.alura.screenmatch.modelos.Episodeo;
import br.com.alura.screenmatch.calculos.CalculadoraDeTempo;
import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Serie;
import br.com.alura.screenmatch.calculos.FiltroRecomendacao;

import java.util.ArrayList;

public class Principal {
    public static void main(String[] args) {
        Filme meuFilme = new Filme("A Orca", 2015);

//        meuFilme.setNome("A Orca");
        meuFilme.setAnoDeLancamento(1978);
        meuFilme.setDuracaoEmMinutos(180);
        meuFilme.exibirFichaTecnica();
        meuFilme.avaliar(7);
        meuFilme.avaliar(2);
        meuFilme.avaliar(10);


        Filme meuFilm2 = new Filme("Avatar", 2023);
//        meuFilm2.setNome("Avatar");
//        meuFilm2.setAnoDeLancamento(2023);
        meuFilm2.setDuracaoEmMinutos(220);
        meuFilm2.exibirFichaTecnica();
        meuFilm2.avaliar(7);
        meuFilm2.avaliar(2);
        meuFilm2.avaliar(10);

        System.out.println(meuFilme.mediaAvaliar());
        System.out.println(meuFilme.getTotalDeAvalicao());

        System.out.println("Duração do filme: " + meuFilme.getDuracaoEmMinutos());

//        -------------------------------------------

        Serie minhaSerie = new Serie("Lost",2000);

        minhaSerie.setTemporada(10);
        minhaSerie.setEpisodiosPorTemporada(100);
        minhaSerie.setMinutosPorEpisodio(50);
//        minhaSerie.setAnoDeLancamento(2000);
        minhaSerie.exibirFichaTecnica();

        System.out.println(minhaSerie.getTemporada());
        System.out.println(minhaSerie.getEpisodiosPorTemporada());

        System.out.println("Duração do filme: " + minhaSerie.getDuracaoEmMinutos());


        CalculadoraDeTempo calculadora = new CalculadoraDeTempo();
        calculadora.incluir(meuFilme);
        calculadora.incluir(meuFilm2);
        calculadora.incluir(minhaSerie);
        System.out.println("Tempo total: " + calculadora.getTempoTotal());



        //        -------------------------------------------
        FiltroRecomendacao filtro = new FiltroRecomendacao();
        filtro.filtrar(meuFilme);
        filtro.filtrar(meuFilm2);

        Episodeo ep = new Episodeo();
        ep.setNumero(1);
        ep.setSerie(minhaSerie);
        ep.setTotalVisualizacoes(1000);
        filtro.filtrar(ep);


        //        -------------------------------------------
        var filmeDoPaulo = new Filme("Dogãos", 1999);
        filmeDoPaulo.setDuracaoEmMinutos(200);
//        filmeDoPaulo.setNome("Dogãos");
//        filmeDoPaulo.setAnoDeLancamento(2023);
        filmeDoPaulo.avaliar(10);

        ArrayList<Filme> listaDeFilmes = new ArrayList<>();
        listaDeFilmes.add(filmeDoPaulo);
        listaDeFilmes.add(meuFilme);
        listaDeFilmes.add(meuFilm2);

        System.out.println("Tamanho da lista: "+ listaDeFilmes.size());
        System.out.println("Primeiro Filme: "+ listaDeFilmes.get(0).getNome());
        System.out.println(listaDeFilmes);
        System.out.println("toString do Primeiro Filme: "+ listaDeFilmes.get(1).toString());


        //        -------------------------------------------



    }
}