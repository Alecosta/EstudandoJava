package br.pro.alecosta.exercicio15poo;

/**
 *
 * @author alecosta
 */
public class Funcionario {
    
    private String nome;
    private String sobrenome;
    private double salarioMensal;
    static int totalDeFuncionariosJaContratados;

    public int getTotalDeFuncionariosJaContratados() {
        return totalDeFuncionariosJaContratados;
    }

    public void setTotalDeFuncionariosJaContratados(int totalDeFuncionariosJaContratados) {
        this.totalDeFuncionariosJaContratados = totalDeFuncionariosJaContratados;
    }

    public Funcionario(String nome, String sobrenome, double salarioMensal) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.salarioMensal = salarioMensal;
        totalDeFuncionariosJaContratados = totalDeFuncionariosJaContratados +1;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public double getSalarioMensal() {
        return salarioMensal;
    }

    public void setSalarioMensal(double salarioMensal) {
        this.salarioMensal = salarioMensal;
    }
    
    
    
    
    
}
