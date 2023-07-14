package br.pro.alecosta.exercicio12poo;

/**
 *
 * @author alecosta
 */
public class Pessoa {
    
    private String nome;
    private int idade;
    private int altura;

    public Pessoa(String nome, int idade, int altura) {
        this.nome = nome;
        this.idade = idade;
        this.altura = altura;
    }
    
     

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }
    
}
