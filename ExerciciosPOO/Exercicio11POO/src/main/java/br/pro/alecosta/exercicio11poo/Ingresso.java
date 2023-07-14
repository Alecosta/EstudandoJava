package br.pro.alecosta.exercicio11poo;

/**
 *
 * @author alecosta
 */
public class Ingresso {
   private float valor;

    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }
   
   public void imprimirValor() {
       System.out.println("Valor Ingresso :"+getValor());
   } 
   
}
