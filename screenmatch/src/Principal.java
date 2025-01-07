import br.com.alura.screenmatch.modelos.Episodeo;
import br.com.alura.screenmatch.modelos.calculos.CalculadoraDeTempo;
import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Serie;
import br.com.alura.screenmatch.modelos.calculos.FiltroRecomendacao;

public class Principal {
    public static void main(String[] args) {
        Filme meuFilme = new Filme();

        meuFilme.setNome("A Orca");
        meuFilme.setAnoDeLancamento(1978);
        meuFilme.setDuracaoEmMinutos(180);
        meuFilme.exibirFichaTecnica();
        meuFilme.avaliar(7);
        meuFilme.avaliar(2);
        meuFilme.avaliar(10);


        Filme meuFilm2 = new Filme();
        meuFilm2.setNome("Avatar ");
        meuFilm2.setAnoDeLancamento(2023);
        meuFilm2.setDuracaoEmMinutos(220);
        meuFilm2.exibirFichaTecnica();
        meuFilm2.avaliar(7);
        meuFilm2.avaliar(2);
        meuFilm2.avaliar(10);

        System.out.println(meuFilme.mediaAvaliar());
        System.out.println(meuFilme.getTotalDeAvalicao());

        System.out.println("Duração do filme: " + meuFilme.getDuracaoEmMinutos());

//        -------------------------------------------

        Serie minhaSerie = new Serie();

        minhaSerie.setTemporada(10);
        minhaSerie.setEpisodiosPorTemporada(100);
        minhaSerie.setMinutosPorEpisodio(50);
        minhaSerie.setAnoDeLancamento(2000);
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


    }
}