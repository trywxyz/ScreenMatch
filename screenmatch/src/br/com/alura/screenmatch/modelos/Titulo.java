package br.com.alura.screenmatch.modelos;

public class Titulo {
    private String nome;
    private int anoDeLancamento;
    private boolean incluidoNoPlano;
    private double somaAvalicao;
    private int totalDeAvalicao;
    private int duracaoEmMinutos;

    public int getTotalDeAvalicao(){
        return totalDeAvalicao;
    };

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getDuracaoEmMinutos() {
        return duracaoEmMinutos;
    }

    public void setDuracaoEmMinutos(int duracaoEmMinutos) {
        this.duracaoEmMinutos = duracaoEmMinutos;
    }

    public void setAnoDeLancamento(int anoDeLancamento) {
        this.anoDeLancamento = anoDeLancamento;
    }

    public void setIncluidoNoPlano(boolean incluidoNoPlano) {
        this.incluidoNoPlano = incluidoNoPlano;
    }

    public void exibirFichaTecnica(){
        System.out.println("Nome do filme: "+ nome);
        System.out.println("Ano de Lançamento: "+anoDeLancamento);
    }
    public void avaliar(double nota){
        somaAvalicao += nota;
        totalDeAvalicao++;
    }
    public double mediaAvaliar(){
        return somaAvalicao / totalDeAvalicao;
    }
}
