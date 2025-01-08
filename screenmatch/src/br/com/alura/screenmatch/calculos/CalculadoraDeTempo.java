package br.com.alura.screenmatch.calculos;

import br.com.alura.screenmatch.modelos.Titulo;

public class CalculadoraDeTempo {
    private int tempoTotal;

    public int getTempoTotal() {
        return tempoTotal;
    }

//    public void incluir(Filme f){
//        tempoTotal += f.getDuracaoEmMinutos();
//    }
//
//    public void incluir(Serie s){
//        tempoTotal += s.getDuracaoEmMinutos();
//    }

    public void incluir(Titulo t){
        this.tempoTotal += t.getDuracaoEmMinutos();
    }
}
