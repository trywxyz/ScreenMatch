package br.com.alura.screenmatch.DesafiosAlura;

import java.util.ArrayList;

public class Desafio01 {
    public static void main(String[] args) {
//        Crie um ArrayList de strings e utilize um loop foreach para percorrer e imprimir cada elemento da lista.
//        Crie uma classe Animal e uma classe Cachorro que herda de Animal. Em seguida, crie um objeto da classe Cachorro e faça o casting para a classe Animal.
//        Modifique o Exercício 2 para incluir uma verificação usando instanceof para garantir que o objeto seja do tipo correto antes de fazer o casting.
//        Crie uma classe Produto com propriedades como nome e preço. Em seguida, crie uma lista de produtos e utilize um loop para calcular e imprimir o preço médio dos produtos.
//        Crie uma interface Forma com um método calcularArea(). Implemente a interface em duas classes, por exemplo, Circulo e Quadrado. Em seguida, crie uma lista de formas (objetos da interface Forma) e utilize um loop para calcular e imprimir a área de cada forma.
//        Crie uma classe ContaBancaria com propriedades como número da conta e saldo. Em seguida, crie uma lista de contas bancárias com diferentes saldos. Utilize um loop para encontrar e imprimir a conta com o maior saldo.

                ArrayList<String> list = new ArrayList<>();

        CachorroDesafio meuCachorro = new CachorroDesafio();
        meuCachorro.emitirSom();


        AnimalDesafio meuAnimal = new AnimalDesafio();
        meuAnimal.emitirSom();

        list.add("Java");
        list.add("C++");
        list.add("Python");

        for (String i : list){
            if(meuCachorro instanceof CachorroDesafio){
                System.out.println(i);
                System.out.println("Os objetos são iguais!");
            }else{
                System.out.println("Os objetos não são iguais!");
            }

        }
    }
}
