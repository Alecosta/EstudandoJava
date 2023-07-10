package br.pro.alecosta.exercicio02poo;

/**
 *
 * @author alecosta
 */
public class ContaCorrente {

    public ContaCorrente(int numeroConta, String nomeCorrentista, float saldo ) {
        this.numeroConta = numeroConta;
        this.nomeCorrentista = nomeCorrentista;
        this.saldo = saldo;
    }
    
    //resolvendo campo opcional com overload 
    public ContaCorrente(int numeroConta, String nomeCorrentista ) {
        this(numeroConta,nomeCorrentista,0);
    }
    
    private int numeroConta; 
    private String nomeCorrentista; 
    private float saldo;
    
    
    public void alterarNome(String novoNome){
       this.nomeCorrentista = novoNome; 
    }; 
    public void deposito(float valor) {
       this.saldo = this.saldo + valor;
        
    }; 
    public void saque(float valor) {
      this.saldo = this.saldo - valor;  
    };    
    
}
