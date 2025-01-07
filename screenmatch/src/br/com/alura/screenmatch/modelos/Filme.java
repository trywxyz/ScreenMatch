package br.com.alura.screenmatch.modelos;

import br.com.alura.screenmatch.modelos.calculos.Classificavel;

public class Filme extends Titulo implements Classificavel {
    private String diretor;

    public String getDiretor() {
        return diretor;
    }

    public void setDiretor(String diretor) {
        this.diretor = diretor;
    }

    @Override
    public int getClassficacao() {
        return (int) mediaAvaliar() / 2;
    }
}
