package br.pro.alecosta.exercicio05poo;

/**
 *
 * @author alecosta
 */
public class Disciplina {
 
    private String matricula;
    private String nome;
    private double prova1;
    private double prova2;
    private double trabalho;
    private double mediaFinal;
    private double mediaParaPassar;

    public double calculamedia() {
      return  (2.5 * this.prova1 + 2.5 * this.prova2 + 2d * this.trabalho ) /(2.5 + 2d + 2.5);       
    }
    
    public double provaFinal() {
        
       double notaNecessaria;
       notaNecessaria = ((2.5 + 2d + 2.5) *this.mediaParaPassar - 2.5 * this.prova1 - 2d * this.trabalho) / 2.5 ;
       
       if (notaNecessaria < 0 ) {
           notaNecessaria = 0;
       }
       
       return notaNecessaria;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getProva1() {
        return prova1;
    }

    public void setProva1(double prova1) {
        this.prova1 = prova1;
    }

    public double getProva2() {
        return prova2;
    }

    public void setProva2(double prova2) {
        this.prova2 = prova2;
    }

    public double getTrabalho() {
        return trabalho;
    }

    public void setTrabalho(double trabalho) {
        this.trabalho = trabalho;
    }

    public double getMediaFinal() {
        return mediaFinal;
    }

    public void setMediaFinal(double mediaFinal) {
        this.mediaFinal = mediaFinal;
    }

    public double getMediaParaPassar() {
        return mediaParaPassar;
    }

    public void setMediaParaPassar(double mediaParaPassar) {
        this.mediaParaPassar = mediaParaPassar;
    }
    
    
    
    
}
