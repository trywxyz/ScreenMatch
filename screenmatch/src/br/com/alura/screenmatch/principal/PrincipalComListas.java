package br.com.alura.screenmatch.principal;

import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Serie;
import br.com.alura.screenmatch.modelos.Titulo;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;

public class PrincipalComListas {
    public static void main(String[] args) {
        Filme meuFilme = new Filme("O Poderoso", 2000);
        meuFilme.avaliar(10);
        Filme meuFilm2 = new Filme("Avatar", 2023);
        meuFilm2.avaliar(6);
        var filmeDoPaulo = new Filme ("Dogaos", 1999);
        filmeDoPaulo.avaliar(7);
        Serie minhaSerie = new Serie("Lost", 2000);

        ArrayList<Titulo> list = new ArrayList<>();
        list.add(filmeDoPaulo);
        list.add(meuFilme);
        list.add(meuFilm2);
        list.add(minhaSerie);

        for (Titulo i: list){
            System.out.println(i.getNome());
            if(i instanceof Filme filme && filme.getClassficacao() > 2){
                System.out.println("Classificação " + filme.getClassficacao());
            }
        };


        ArrayList<String> buscaPorArtista = new ArrayList<>();
        buscaPorArtista.add("Adam Sandler");
        buscaPorArtista.add("Paulo");
        buscaPorArtista.add("Jacqueline");

        System.out.println(buscaPorArtista);

        Collections.sort(buscaPorArtista);
        System.out.println("Depois da ordenação");
        System.out.println(buscaPorArtista);
        System.out.println("Lista de titulos ordenados:");
        Collections.sort(list);
        System.out.println(list);
        list.sort(Comparator.comparing(Titulo::getAnoDeLancamento));
        System.out.println("Ordenando por ano:");
        System.out.println(list);


    }
}
