package br.com.alura.screenmatch.modelos;

public class Titulo implements Comparable<Titulo>{
//    @SerializedName("Title") Gson
    private String nome;
//    @SerializedName("Year") Gson
    private int anoDeLancamento;
    private boolean incluidoNoPlano;
    private double somaAvalicao;
    private int totalDeAvalicao;
    private int duracaoEmMinutos;

    public Titulo(String nome, int anoDeLancamento) {
        this.nome = nome;
        this.anoDeLancamento = anoDeLancamento;
    }

    public int getTotalDeAvalicao(){
        return totalDeAvalicao;
    };

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getAnoDeLancamento() {
        return anoDeLancamento;
    }

    public boolean isIncluidoNoPlano() {
        return incluidoNoPlano;
    }

    public double getSomaAvalicao() {
        return somaAvalicao;
    }

    public void setSomaAvalicao(double somaAvalicao) {
        this.somaAvalicao = somaAvalicao;
    }

    public void setTotalDeAvalicao(int totalDeAvalicao) {
        this.totalDeAvalicao = totalDeAvalicao;
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

//    Gson
//    public Titulo(TituloOmdb meuTituloOmdb){
//        this.nome = meuTituloOmdb.title();
//        this.anoDeLancamento = Integer.valueOf(meuTituloOmdb.year());
//        this.duracaoEmMinutos = Integer.valueOf(meuTituloOmdb.runtime().substring(0,2));
//    }

    public String getNome() {
        return nome;
    }

    public void avaliar(double nota){
        somaAvalicao += nota;
        totalDeAvalicao++;
    }
    public double mediaAvaliar(){
        return somaAvalicao / totalDeAvalicao;
    }

    @Override
    public int compareTo(Titulo outroTitulo) {
        return this.getNome().compareTo(outroTitulo.getNome());
    };

    @Override
    public String toString() {
        return "Titulo{" +
                "anoDeLancamento=" + anoDeLancamento +
                ", nome='" + nome + '\'' +
                ", duracaoEmMinutos=" + duracaoEmMinutos +
                '}';
    }
}
