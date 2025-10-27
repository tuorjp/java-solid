package br.com.alura.domain;

public class Pet {
    public Pet(
            String nome,
            String tipo,
            String raca,
            int idade,
            String cor,
            Float peso
    ) {
        this.nome = nome;
        this.tipo = tipo;
        this.cor = cor;
        this.idade = idade;
        this.peso = peso;
        this.raca = raca;
    }

    private String nome;
    private String tipo;
    private String raca;
    private int idade;
    private String cor;
    private Float peso;
}
