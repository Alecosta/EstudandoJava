package br.pro.alecosta.exercicio10poo;

import java.time.LocalDate;

/**
 *
 * @author alecosta
 */
public class Jogador {
    
    private String nome;
    private String posicao;
    private Data dataNascimento;
    private String nacionalidade;
    private double altura;
    private double peso;
    private int idadeEmAnos;

    public Jogador(String nome, String posicao, Data dataNascimento, String nacionalidade, double altura, double peso) {
        this.nome = nome;
        this.posicao = posicao;
        this.dataNascimento = dataNascimento;
        this.nacionalidade = nacionalidade;
        this.altura = altura;
        this.peso = peso;
        
        LocalDate dataAtual = LocalDate.now();
        int anoAtual = dataAtual.getYear();
        
        this.idadeEmAnos = anoAtual - dataNascimento.getAno();
        
    }

    
    
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getPosição() {
        return posicao;
    }

    public void setPosição(String posicao) {
        this.posicao = posicao;
    }

    public Data getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(Data dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }
    
    public int getIdade () {
        return this.idadeEmAnos;
    }
    
    public String dataFormatada () {
        return this.dataNascimento.dataFormatada();
    }
    
    public void imprimirDados() {
     
        System.out.println("Nome do Jogador "+getNome());
        System.out.println("Posicao "+getPosição());
        System.out.println("Nacionalidade "+getNacionalidade());
        System.out.println("Data de Nascimento "+dataFormatada());
        System.out.println("Altura "+getAltura());
        System.out.println("Peso "+getPeso());
        System.out.println("Idade "+getIdade()+" anos ");
        System.out.println("Tempo para Aposentadoria: "+tempoParaAposentar()+" anos ");
        
        
    }
    
    public int calculaIdade () {
        return 25;
    }
    
    public int tempoParaAposentar () {
        
        int aposentaAos = 0;
        if (this.posicao == "atacante") {
            aposentaAos = 35; 
        } else {
          if (this.posicao == "meio-campo") {
            aposentaAos = 38;   
          }  else {
              if (this.posicao == "defesa")  {
                aposentaAos = 40; 
              }
          }
        } 
        
        if (this.idadeEmAnos < aposentaAos) {
            return aposentaAos - idadeEmAnos;
        } 
        return 0;
    }
    
    
}
