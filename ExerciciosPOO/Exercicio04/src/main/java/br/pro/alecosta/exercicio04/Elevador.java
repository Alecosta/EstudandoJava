package br.pro.alecosta.exercicio04;

/**
 *
 * @author alecosta
 */
public class Elevador {
    private int andarAtual;
    private int totalAndares;
    private int capacidadeElevador;
    private int qtdPessoasPresentes;
    
    public void inicializa (int capacidade, int andares) {
        this.capacidadeElevador = capacidade;
        this.totalAndares = andares;
        this.andarAtual = 0;
        this.qtdPessoasPresentes = 0;
                
    }

    public void entra() {
      if (getQtdPessoasPresentes() < getCapacidadeElevador()) {
          setQtdPessoasPresentes(getQtdPessoasPresentes()+1);
      } 
    }
    
    public void Sai() {
      if (getQtdPessoasPresentes() > 0) {
          setQtdPessoasPresentes(getQtdPessoasPresentes()-1);
      }  
    }

    public void Sobe() {
        if (getAndarAtual() < getTotalAndares()) {
            setAndarAtual(getAndarAtual()+1);
        }
    } 

    public void Desce() {
        if (getAndarAtual() > 0) {
            setAndarAtual(getAndarAtual()-1);
        }
    }

    public int getAndarAtual() {
        return andarAtual;
    }

    public void setAndarAtual(int andarAtual) {
        this.andarAtual = andarAtual;
    }

    public int getTotalAndares() {
        return totalAndares;
    }

    public void setTotalAndares(int totalAndares) {
        this.totalAndares = totalAndares;
    }

    public int getCapacidadeElevador() {
        return capacidadeElevador;
    }

    public void setCapacidadeElevador(int capacidadeElevador) {
        this.capacidadeElevador = capacidadeElevador;
    }

    public int getQtdPessoasPresentes() {
        return qtdPessoasPresentes;
    }

    public void setQtdPessoasPresentes(int qtdPessoasPresentes) {
        this.qtdPessoasPresentes = qtdPessoasPresentes;
    }
    
    
}
