package br.pro.alecosta.exercicio11poo;

/**
 *
 * @author alecosta
 */
public class IngressoVIP extends Ingresso{
   
    private float valorAdicional;

    public float getValorAdicional() {
        return valorAdicional;
    }

    public void setValorAdicional(float valorAdicional) {
        this.valorAdicional = valorAdicional;
    }
    
    public float ValorComAdicional() {
        return this.getValor() + this.getValorAdicional();
    }
    
    
}
