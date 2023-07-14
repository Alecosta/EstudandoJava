package br.pro.alecosta.exercicio11poo;

/**
 *
 * @author alecosta
 */
public class Exercicio11POO {

    public static void main(String[] args) {
       /*Crie uma classe chamada Ingresso, que possui 
        um valor em reais e 
        um método imprimirValor.
        
        Crie uma classe IngressoVIP, que herda de Ingresso e 
        possui um valor adicional. 
        Crie um método que retorne o valor do ingresso VIP 
        (com o adicional incluído). 
        
        Crie um programa para criar as instâncias de 
        Ingresso e
        IngressoVIP, 
        
        mostrando a diferença de preços.*/
       
       Ingresso meuIngresso = new Ingresso();
       meuIngresso.setValor(100f);
       System.out.println("Valor do Ingresso "+ meuIngresso.getValor());
       
       IngressoVIP meuIngressoVIP = new IngressoVIP();
       meuIngressoVIP.setValor(100);
       meuIngressoVIP.setValorAdicional(20);
       System.out.println("Valor do Ingresso VIP "+ meuIngressoVIP.ValorComAdicional());       
       float diferencaPreco = meuIngressoVIP.ValorComAdicional() - meuIngresso.getValor();
       System.out.println("Diferenca de preco "+ diferencaPreco);
    }
}
